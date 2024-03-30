package X;

import android.content.Context;
import android.os.ConditionVariable;

/* renamed from: X.5MO  reason: invalid class name */
public class AnonymousClass5MO extends C132446Tt {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ ConditionVariable A01;
    public final /* synthetic */ ConditionVariable A02;
    public final /* synthetic */ C20220xD A03;
    public final /* synthetic */ C33151eo A04;
    public final /* synthetic */ Runnable A05;

    public AnonymousClass5MO(Context context, ConditionVariable conditionVariable, ConditionVariable conditionVariable2, C20220xD r4, C33151eo r5, Runnable runnable) {
        this.A03 = r4;
        this.A00 = context;
        this.A02 = conditionVariable;
        this.A01 = conditionVariable2;
        this.A04 = r5;
        this.A05 = runnable;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        this.A05.run();
    }
}
