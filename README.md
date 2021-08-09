# agp_hilt_jacoco_runtime_issue

environment: agp 4.2.1 + hilt + jacoco 

If you use target package inline function, This combination produces the following runtime error during instrumentation test

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
