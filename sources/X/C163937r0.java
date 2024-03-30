package X;

import android.os.Parcelable;
import com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling;
import com.facebook.cameracore.ardelivery.model.AREffectAsyncAsset;

/* renamed from: X.7r0  reason: invalid class name and case insensitive filesystem */
public class C163937r0 implements Parcelable.Creator {
    public final int A00;

    public C163937r0(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a6, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a7, code lost:
        X.AnonymousClass6RS.A00((X.C1271967i) null, "BloksDataStorage", "Casting error when retrieving data", r2);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x016a;
                case 1: goto L_0x0160;
                case 2: goto L_0x0156;
                case 3: goto L_0x0101;
                case 4: goto L_0x00fb;
                case 5: goto L_0x00f5;
                case 6: goto L_0x00ef;
                case 7: goto L_0x00e9;
                case 8: goto L_0x00e3;
                case 9: goto L_0x00dd;
                case 10: goto L_0x00d7;
                case 11: goto L_0x00d1;
                case 12: goto L_0x00cb;
                case 13: goto L_0x007f;
                case 14: goto L_0x0079;
                case 15: goto L_0x0073;
                case 16: goto L_0x006d;
                case 17: goto L_0x0067;
                case 18: goto L_0x005d;
                case 19: goto L_0x0053;
                case 20: goto L_0x004d;
                case 21: goto L_0x0035;
                case 22: goto L_0x002f;
                case 23: goto L_0x0029;
                case 24: goto L_0x0023;
                case 25: goto L_0x001d;
                case 26: goto L_0x0017;
                case 27: goto L_0x0011;
                case 28: goto L_0x000b;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.6bn r1 = new X.6bn
            r1.<init>(r7)
            return r1
        L_0x000b:
            X.6by r1 = new X.6by
            r1.<init>(r7)
            return r1
        L_0x0011:
            X.6bp r1 = new X.6bp
            r1.<init>(r7)
            return r1
        L_0x0017:
            X.544 r1 = new X.544
            r1.<init>(r7)
            return r1
        L_0x001d:
            X.4dQ r1 = new X.4dQ
            r1.<init>(r7)
            return r1
        L_0x0023:
            X.4dO r1 = new X.4dO
            r1.<init>(r7)
            return r1
        L_0x0029:
            X.6c7 r1 = new X.6c7
            r1.<init>(r7)
            return r1
        L_0x002f:
            X.6c9 r1 = new X.6c9
            r1.<init>(r7)
            return r1
        L_0x0035:
            java.lang.String r3 = X.C36341k9.A0g(r7)
            X.C18740tg.A06(r3)
            X.AnonymousClass00C.A08(r3)
            java.lang.String r2 = r7.readString()
            java.lang.String r0 = r7.readString()
            X.6bQ r1 = new X.6bQ
            r1.<init>(r3, r2, r0)
            return r1
        L_0x004d:
            X.6s9 r1 = new X.6s9
            r1.<init>(r7)
            return r1
        L_0x0053:
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            X.6bw r1 = new X.6bw
            r1.<init>(r7)
            return r1
        L_0x005d:
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            X.543 r1 = new X.543
            r1.<init>(r7)
            return r1
        L_0x0067:
            X.4dN r1 = new X.4dN
            r1.<init>((android.os.Parcel) r7)
            return r1
        L_0x006d:
            X.6bu r1 = new X.6bu
            r1.<init>(r7)
            return r1
        L_0x0073:
            X.4dP r1 = new X.4dP
            r1.<init>((android.os.Parcel) r7)
            return r1
        L_0x0079:
            X.6bo r1 = new X.6bo
            r1.<init>(r7)
            return r1
        L_0x007f:
            int r5 = r7.readInt()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.Class<X.7fL> r4 = X.AnonymousClass7fL.class
            r3 = 0
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r2 = X.C113845gD.A01     // Catch:{ ClassCastException -> 0x00a6 }
            monitor-enter(r2)     // Catch:{ ClassCastException -> 0x00a6 }
            android.util.SparseArray r1 = X.C113845gD.A00     // Catch:{ all -> 0x00a3 }
            int r0 = r1.indexOfKey(r5)     // Catch:{ all -> 0x00a3 }
            if (r0 >= 0) goto L_0x0099
            r0 = r3
            goto L_0x00a1
        L_0x0099:
            java.lang.Object r0 = r1.get(r5)     // Catch:{ all -> 0x00a3 }
            java.lang.Object r0 = r4.cast(r0)     // Catch:{ all -> 0x00a3 }
        L_0x00a1:
            monitor-exit(r2)     // Catch:{ ClassCastException -> 0x00a6 }
            goto L_0x00af
        L_0x00a3:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ ClassCastException -> 0x00a6 }
            throw r0     // Catch:{ ClassCastException -> 0x00a6 }
        L_0x00a6:
            r2 = move-exception
            java.lang.String r1 = "BloksDataStorage"
            java.lang.String r0 = "Casting error when retrieving data"
            X.AnonymousClass6RS.A00(r3, r1, r0, r2)
            goto L_0x00b0
        L_0x00af:
            r3 = r0
        L_0x00b0:
            X.7fL r3 = (X.AnonymousClass7fL) r3
            if (r3 != 0) goto L_0x00c5
            X.5S6 r2 = X.AnonymousClass5S6.ERROR
            java.lang.String r1 = "CdsOpenScreenCallerDismissCallback"
            java.lang.String r0 = "Expected non-null CallerDismissCallbackRunnable from BloksDataStorage"
            X.AnonymousClass6RL.A00(r2, r1, r0)
            X.6oj r0 = X.C142346oj.A00
            X.6b6 r1 = new X.6b6
            r1.<init>(r0)
            return r1
        L_0x00c5:
            X.6b6 r1 = new X.6b6
            r1.<init>(r3)
            return r1
        L_0x00cb:
            X.6c0 r1 = new X.6c0
            r1.<init>(r7)
            return r1
        L_0x00d1:
            X.6cD r1 = new X.6cD
            r1.<init>(r7)
            return r1
        L_0x00d7:
            X.6c3 r1 = new X.6c3
            r1.<init>(r7)
            return r1
        L_0x00dd:
            com.facebook.cameracore.ardelivery.model.AREffectAsyncAsset r1 = new com.facebook.cameracore.ardelivery.model.AREffectAsyncAsset
            r1.<init>(r7)
            return r1
        L_0x00e3:
            com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling r1 = new com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling
            r1.<init>(r7)
            return r1
        L_0x00e9:
            X.6bt r1 = new X.6bt
            r1.<init>((android.os.Parcel) r7)
            return r1
        L_0x00ef:
            X.6c5 r1 = new X.6c5
            r1.<init>(r7)
            return r1
        L_0x00f5:
            X.6bv r1 = new X.6bv
            r1.<init>(r7)
            return r1
        L_0x00fb:
            X.6bx r1 = new X.6bx
            r1.<init>(r7)
            return r1
        L_0x0101:
            java.lang.String r0 = r7.readString()
            X.6bA r1 = new X.6bA
            r1.<init>(r0)
            java.lang.String r0 = r7.readString()
            r1.A04 = r0
            java.lang.String r0 = r7.readString()
            r1.A0B = r0
            java.lang.String r0 = r7.readString()
            r1.A02 = r0
            java.lang.String r0 = r7.readString()
            r1.A0A = r0
            java.lang.String r0 = r7.readString()
            r1.A03 = r0
            java.lang.String r0 = r7.readString()
            r1.A05 = r0
            java.lang.String r0 = r7.readString()
            r1.A06 = r0
            java.lang.String r0 = r7.readString()
            r1.A07 = r0
            float r0 = r7.readFloat()
            r1.A00 = r0
            float r0 = r7.readFloat()
            r1.A01 = r0
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r1.A0C = r0
            r7.readStringList(r0)
            java.lang.String r0 = r7.readString()
            r1.A09 = r0
            return r1
        L_0x0156:
            int r0 = r7.readInt()
            X.4hW r1 = new X.4hW
            r1.<init>(r0)
            return r1
        L_0x0160:
            float r0 = r7.readFloat()
            X.4hU r1 = new X.4hU
            r1.<init>(r0)
            return r1
        L_0x016a:
            int r0 = r7.readInt()
            X.6bC r1 = new X.6bC
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163937r0.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new C134536bC[i];
            case 1:
                return new C94004hU[i];
            case 2:
                return new C94024hW[i];
            case 3:
                return new C134516bA[i];
            case 4:
                return new C134996bx[i];
            case 5:
                return new C134976bv[i];
            case 6:
                return new C135076c5[i];
            case 7:
                return new C134956bt[i];
            case 8:
                return new ARCapabilityMinVersionModeling[i];
            case 9:
                return new AREffectAsyncAsset[i];
            case 10:
                return new C135056c3[i];
            case 11:
                return new C135146cD[i];
            case 12:
                return new C135026c0[i];
            case 13:
                return new C134476b6[i];
            case 14:
                return new C134916bo[i];
            case 15:
                return new C92264dP[i];
            case 16:
                return new C134966bu[i];
            case 17:
                return new C92244dN[i];
            case 18:
                return new AnonymousClass543[i];
            case 19:
                return new C134986bw[i];
            case 20:
                return new C144416s9[i];
            case 21:
                return new C134676bQ[i];
            case 22:
                return new C135106c9[i];
            case 23:
                return new C135086c7[i];
            case 24:
                return new C92254dO[i];
            case 25:
                return new C92274dQ[i];
            case 26:
                return new AnonymousClass544[i];
            case 27:
                return new C134926bp[i];
            case 28:
                return new C135006by[i];
            default:
                return new C134906bn[i];
        }
    }
}
