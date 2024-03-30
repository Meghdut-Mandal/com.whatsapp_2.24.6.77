package X;

import org.json.JSONObject;

/* renamed from: X.71U  reason: invalid class name */
public final class AnonymousClass71U implements C159797jw {
    public final /* synthetic */ C160057kO A00;
    public final /* synthetic */ C135086c7 A01;
    public final /* synthetic */ C135086c7 A02;
    public final /* synthetic */ C145546u7 A03;

    public void BWj(AnonymousClass5V6 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00.BWk(r2);
    }

    public AnonymousClass71U(C160057kO r1, C135086c7 r2, C135086c7 r3, C145546u7 r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void BiI(JSONObject jSONObject) {
        C18740tg.A06(jSONObject);
        Object obj = this.A01.A00;
        C18740tg.A06(obj);
        C18740tg.A06(obj);
        AnonymousClass6OQ A002 = AnonymousClass1UW.A00(C145546u7.A0B, (String) obj, jSONObject);
        Object obj2 = A002.A04.A00;
        C18740tg.A06(obj2);
        Object obj3 = this.A02.A00;
        C18740tg.A06(obj3);
        if (AnonymousClass00C.A0J(obj2, obj3)) {
            this.A00.Bi5(A002);
        } else {
            this.A00.BWk(AnonymousClass001.A09("ids do not match"));
        }
    }
}
