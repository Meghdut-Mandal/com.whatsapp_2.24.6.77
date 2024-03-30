package X;

/* renamed from: X.4NU  reason: invalid class name */
public final class AnonymousClass4NU extends AnonymousClass00R implements C009003v {
    public static final AnonymousClass4NU A00 = new AnonymousClass4NU();

    public AnonymousClass4NU() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Integer num;
        AnonymousClass3XO r4 = (AnonymousClass3XO) obj;
        AnonymousClass3XO r5 = (AnonymousClass3XO) obj2;
        Integer num2 = null;
        if (r4 != null) {
            num = r4.A03;
        } else {
            num = null;
        }
        C18740tg.A06(num);
        int intValue = num.intValue();
        if (r5 != null) {
            num2 = r5.A03;
        }
        return Integer.valueOf(intValue - C36411kG.A06(num2));
    }
}
