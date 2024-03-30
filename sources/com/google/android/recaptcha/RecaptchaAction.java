package com.google.android.recaptcha;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.C05250Oz;
import X.C90474aD;

public final class RecaptchaAction {
    public static final Companion Companion = new Companion();
    public static final RecaptchaAction LOGIN = new RecaptchaAction("login");
    public static final RecaptchaAction SIGNUP = new RecaptchaAction("signup");
    public final String action;

    public final class Companion {
        public Companion() {
        }

        public final RecaptchaAction custom(String str) {
            return new RecaptchaAction(str);
        }

        public /* synthetic */ Companion(C05250Oz r1) {
        }
    }

    public RecaptchaAction(String str) {
        this.action = str;
    }

    public /* synthetic */ RecaptchaAction(String str, C05250Oz r2) {
        this(str);
    }

    public final String component1() {
        return this.action;
    }

    public final RecaptchaAction copy(String str) {
        return new RecaptchaAction(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof RecaptchaAction) && AnonymousClass00C.A0J(this.action, ((RecaptchaAction) obj).action));
    }

    public final String getAction() {
        return this.action;
    }

    public int hashCode() {
        return this.action.hashCode();
    }

    public static /* synthetic */ RecaptchaAction copy$default(RecaptchaAction recaptchaAction, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recaptchaAction.action;
        }
        return new RecaptchaAction(str);
    }

    public static final RecaptchaAction custom(String str) {
        return new RecaptchaAction(str);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RecaptchaAction(action=");
        A0u.append(this.action);
        return C90474aD.A0f(A0u);
    }
}
