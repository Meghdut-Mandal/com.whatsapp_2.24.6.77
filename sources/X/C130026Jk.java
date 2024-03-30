package X;

/* renamed from: X.6Jk  reason: invalid class name and case insensitive filesystem */
public final class C130026Jk {
    public AnonymousClass17Y A00;
    public AnonymousClass005 A01;

    public static final void A00(C130026Jk r13, C158077fl r14, C158077fl r15, Integer num, Object obj, String str, String str2, String str3) {
        C135086c7 r2;
        C135086c7 r6;
        C135086c7 r7;
        C130026Jk r9 = r13;
        AnonymousClass005 r0 = r13.A01;
        if (r0 != null) {
            AnonymousClass61L r3 = (AnonymousClass61L) r0.get();
            String str4 = str;
            if (str == null) {
                r2 = null;
            } else {
                r2 = new C135086c7(C146356vT.A00(), str4, "WaLinkedNativeAuthBlob");
            }
            String str5 = str2;
            if (str2 == null) {
                r6 = null;
            } else {
                r6 = new C135086c7(C146356vT.A00(), str5, "WaLinkedWebAuthToken");
            }
            String str6 = str3;
            if (str3 == null) {
                r7 = null;
            } else {
                r7 = new C135086c7(C146356vT.A00(), str6, "WaLinkedWebAuthUri");
            }
            C165027sl r8 = new C165027sl(r9, r14, r15, obj, 1);
            AnonymousClass1UA A0M = C90524aI.A0M(r3.A00);
            AnonymousClass6P0 r32 = C113435fX.A00;
            Object[] objArr = new Object[6];
            C36341k9.A1I((Object) null, num, objArr);
            C90514aH.A1O((Object) null, r2, objArr);
            C36381kD.A1L(r6, r7, objArr);
            A0M.A04(new C145446tu(r8), r32, C128936Ee.A00(), new C120425rU(2, C90494aF.A0j(objArr)));
            return;
        }
        throw C36331k8.A0d("accountLinkingCustomActionsHelperLazy");
    }
}
