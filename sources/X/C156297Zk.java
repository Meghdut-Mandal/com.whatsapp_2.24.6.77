package X;

/* renamed from: X.7Zk  reason: invalid class name and case insensitive filesystem */
public final class C156297Zk extends AnonymousClass00R implements C009003v {
    public static final C156297Zk A00 = new C156297Zk();

    public C156297Zk() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass5SW r8;
        AnonymousClass7bL r0;
        AnonymousClass7bM r10 = (AnonymousClass7bM) obj;
        C128326Bu r11 = (C128326Bu) obj2;
        Object obj3 = r11.A02;
        if (obj3 instanceof C129026Eq) {
            r8 = AnonymousClass5SW.Paragraph;
        } else if (obj3 instanceof AnonymousClass6FJ) {
            r8 = AnonymousClass5SW.Span;
        } else if (obj3 instanceof C95054ji) {
            r8 = AnonymousClass5SW.VerbatimTts;
        } else if (obj3 instanceof AnonymousClass68Q) {
            r8 = AnonymousClass5SW.Url;
        } else {
            r8 = AnonymousClass5SW.String;
        }
        int ordinal = r8.ordinal();
        if (ordinal == 0) {
            AnonymousClass00C.A0E(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
            r0 = AnonymousClass6JC.A09;
        } else if (ordinal == 1) {
            AnonymousClass00C.A0E(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
            r0 = AnonymousClass6JC.A0B;
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                AnonymousClass00C.A0E(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                r0 = AnonymousClass6JC.A0H;
            }
            Object[] objArr = new Object[5];
            objArr[0] = r8;
            objArr[1] = obj3;
            AnonymousClass000.A1L(objArr, r11.A01, 2);
            AnonymousClass000.A1L(objArr, r11.A00, 3);
            objArr[4] = r11.A03;
            return AnonymousClass03T.A02(objArr);
        } else {
            AnonymousClass00C.A0E(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
            r0 = AnonymousClass6JC.A0I;
        }
        obj3 = AnonymousClass6JC.A00(r0, r10, obj3);
        Object[] objArr2 = new Object[5];
        objArr2[0] = r8;
        objArr2[1] = obj3;
        AnonymousClass000.A1L(objArr2, r11.A01, 2);
        AnonymousClass000.A1L(objArr2, r11.A00, 3);
        objArr2[4] = r11.A03;
        return AnonymousClass03T.A02(objArr2);
    }
}
