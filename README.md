# agp_hilt_jacoco_runtime_issue

environment: agp 4.2.1 or 7.0.0 + hilt(2.38.1) + jacoco  

- agp 4.1.0 not reproduced
- hilt 2.29-alpha not reproduced

If you use target package inline function, This combination produces the following runtime error during instrumentation test

```
java.lang.IllegalAccessError: Method 'boolean[] com.sebiya.myapplication.ktx.LiveDataExtKt.$jacocoInit()' is inaccessible to class 'com.sebiya.myapplication.ktx.LiveDataExtTest$test$1' (declaration of 'com.sebiya.myapplication.ktx.LiveDataExtTest$test$1' appears in /data/app/com.sebiya.myapplication.test-k96V62DI7NLdC6nil9WOIg==/base.apk!classes4.dex)
	at com.sebiya.myapplication.ktx.LiveDataExtTest$test$1.invokeSuspend(LiveDataExtTest.kt:11)
	at kotlin.coroutines.jvm.internal.BaseContinuationImpl.resumeWith(ContinuationImpl.kt:33)
	at kotlinx.coroutines.DispatchedTask.run(DispatchedTask.kt:106)
	at android.os.Handler.handleCallback(Handler.java:883)
	at android.os.Handler.dispatchMessage(Handler.java:100)
	at android.os.Looper.loop(Looper.java:237)
	at android.app.ActivityThread.main(ActivityThread.java:8167)
	at java.lang.reflect.Method.invoke(Native Method)
	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:496)
	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:1100)

```

According to below issue tracker, this issue has been fixed since AGP 7.1 alpha 11 
```
https://issuetracker.google.com/issues/197065758

am...@google.com<am...@google.com> #2Aug 25, 2021 12:45AM
Marked as fixed.
Fixed by https://android.googlesource.com/platform/tools/base/+/96875fd6262865cb77f13b42d213f8301d0833ab, the fix should land in AGP 7.1 alpha 11
```
