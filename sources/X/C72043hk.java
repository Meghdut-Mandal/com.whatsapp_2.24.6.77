package X;

/* renamed from: X.3hk  reason: invalid class name and case insensitive filesystem */
public final class C72043hk implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A01 = C63573Ko.A01(r8);
        C64563Om[] r3 = new C64563Om[6];
        C52502pX A02 = C52502pX.A02(A01);
        boolean A0h = C63573Ko.A0h(A01, A02, r3);
        A01.A02 = "waveform";
        C63573Ko.A0V(A01, C52502pX.BLOB, r3, A0h ? 1 : 0);
        r3[2] = C63573Ko.A04(A01, A02, "background_color", 0, A0h);
        C63573Ko.A09(A01, A02, "transcription_status", r3);
        C63573Ko.A0A(A01, A02, "transcription_locale", r3);
        C63573Ko.A0B(A01, A02, "transcription_confidence_threshold", r3);
        r8.A0B("audio_data", r3);
    }

    public /* synthetic */ void B7s(C224114e r2, AnonymousClass38H r3, C65063Qo r4) {
        AnonymousClass00C.A0D(r4, 0);
        C63843Lq.A01(r4, "audio_data");
    }
}
