package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* renamed from: X.09z  reason: invalid class name */
public abstract class AnonymousClass09z implements C023509x, C023609y, Serializable {
    public final C023509x completion;

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    public final void resumeWith(Object obj) {
        C023509x r2 = this;
        while (true) {
            AnonymousClass09z r22 = (AnonymousClass09z) r2;
            C023509x r1 = r22.completion;
            AnonymousClass00C.A0B(r1);
            try {
                obj = r22.invokeSuspend(obj);
                if (obj == AnonymousClass0AO.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = new AnonymousClass03N(th);
            }
            r22.releaseIntercepted();
            if (r1 instanceof AnonymousClass09z) {
                r2 = r1;
            } else {
                r1.resumeWith(obj);
                return;
            }
        }
    }

    public static C023509x A00(Object obj, Object obj2, AnonymousClass09z r2) {
        return r2.create(obj2, (C023509x) obj);
    }

    public C023509x create(Object obj, C023509x r4) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public C023609y getCallerFrame() {
        C023509x r1 = this.completion;
        if (r1 instanceof C023609y) {
            return (C023609y) r1;
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public AnonymousClass09z(C023509x r1) {
        this.completion = r1;
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        int i2;
        String obj;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj2;
        int i3;
        Integer num;
        Class<?> cls = getClass();
        DebugMetadata debugMetadata = (DebugMetadata) cls.getAnnotation(DebugMetadata.class);
        if (debugMetadata == null) {
            return null;
        }
        int v = debugMetadata.v();
        if (v <= 1) {
            try {
                Field declaredField = cls.getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj3 = declaredField.get(this);
                if (!(obj3 instanceof Integer) || (num = (Integer) obj3) == null) {
                    i3 = 0;
                } else {
                    i3 = num.intValue();
                }
                i = i3 - 1;
            } catch (Exception unused) {
                i = -1;
            }
            if (i < 0) {
                i2 = -1;
            } else {
                i2 = debugMetadata.l()[i];
            }
            AnonymousClass0T3 r8 = C05930Rq.A00;
            if (r8 == null) {
                try {
                    r8 = new AnonymousClass0T3(Class.class.getDeclaredMethod("getModule", new Class[0]), cls.getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), cls.getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, new Class[0]));
                    C05930Rq.A00 = r8;
                } catch (Exception unused2) {
                    r8 = C05930Rq.A01;
                    C05930Rq.A00 = r8;
                }
            }
            String str = null;
            if (!(r8 == C05930Rq.A01 || (method = r8.A01) == null || (invoke = method.invoke(cls, new Object[0])) == null || (method2 = r8.A00) == null || (invoke2 = method2.invoke(invoke, new Object[0])) == null)) {
                Method method3 = r8.A02;
                if (method3 != null) {
                    obj2 = method3.invoke(invoke2, new Object[0]);
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof String) {
                    str = (String) obj2;
                }
            }
            if (str == null) {
                obj = debugMetadata.c();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append('/');
                sb.append(debugMetadata.c());
                obj = sb.toString();
            }
            return new StackTraceElement(obj, debugMetadata.m(), debugMetadata.f(), i2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Debug metadata version mismatch. Expected: ");
        sb2.append(1);
        sb2.append(", got ");
        sb2.append(v);
        sb2.append(". Please update the Kotlin standard library.");
        throw new IllegalStateException(sb2.toString());
    }

    public final C023509x getCompletion() {
        return this.completion;
    }

    public C023509x create(C023509x r3) {
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }
}
