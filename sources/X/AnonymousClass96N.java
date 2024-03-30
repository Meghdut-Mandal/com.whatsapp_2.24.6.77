package X;

/* renamed from: X.96N  reason: invalid class name */
public class AnonymousClass96N extends C03030Cw implements AnonymousClass00S {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass96N(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L_0x001b;
                case 1: goto L_0x0013;
                case 2: goto L_0x0013;
                case 3: goto L_0x0013;
                case 4: goto L_0x0013;
                case 5: goto L_0x0013;
                case 6: goto L_0x0013;
                case 7: goto L_0x0013;
                case 8: goto L_0x0013;
                case 9: goto L_0x0013;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<com.whatsapp.preference.WaMuteSettingPreference> r3 = com.whatsapp.preference.WaMuteSettingPreference.class
            r1 = 0
            java.lang.String r4 = "logMuteClick"
            java.lang.String r5 = "logMuteClick()V"
        L_0x000d:
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0013:
            java.lang.Class<X.005> r3 = X.AnonymousClass005.class
            r1 = 0
            java.lang.String r4 = "get"
            java.lang.String r5 = "get()Ljava/lang/Object;"
            goto L_0x000d
        L_0x001b:
            java.lang.Class<X.8AA> r3 = X.AnonymousClass8AA.class
            r1 = 0
            java.lang.String r4 = "handleOnDisconnected"
            java.lang.String r5 = "handleOnDisconnected()V"
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass96N.<init>(java.lang.Object, int):void");
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                AnonymousClass9AO.A01.A06("sup:SocketConnectionStateDelegate", "[SOCKET_CONNECTION] LinkedDevice onDisconnected", (Throwable) null);
                break;
            case 10:
            case 11:
                break;
            default:
                return ((AnonymousClass005) this.receiver).get();
        }
        return AnonymousClass0AJ.A00;
    }
}
