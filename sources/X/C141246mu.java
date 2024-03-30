package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.io.File;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6mu  reason: invalid class name and case insensitive filesystem */
public class C141246mu implements C160907lm {
    public int A00;
    public long A01;
    public MediaFormat A02;
    public MediaFormat A03;
    public Map A04;
    public boolean A05;
    public int A06;
    public long A07;
    public long A08;
    public C107725Qp A09;
    public C131456Pc A0A;
    public AnonymousClass5TE A0B;
    public C160907lm A0C;
    public C159097io A0D;
    public C114975i8 A0E = new C114975i8();
    public AnonymousClass65W A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final long A0J;
    public final long A0K;
    public final long A0L;
    public final C109635Yi A0M;
    public final C118695oa A0N;
    public final String A0O;

    public static Integer A00(String str) {
        String str2;
        for (Integer num : C023109s.A00(3)) {
            switch (num.intValue()) {
                case 1:
                    str2 = "Merlot";
                    break;
                case 2:
                    str2 = CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID;
                    break;
                default:
                    str2 = "Facebook View";
                    break;
            }
            if (str2.equals(str)) {
                return num;
            }
        }
        return C023109s.A0C;
    }

    public void B3Q(String str) {
        throw null;
    }

    public void stop() {
        try {
            A03(this, false);
            long j = this.A0L;
            long j2 = j;
            long j3 = this.A01;
            if (j3 != -1) {
                j = j3;
            }
            long j4 = this.A07;
            if (j4 != -1) {
                j = Math.min(j, j4);
            }
            A02(this.A0C, j2 - j, true);
        } finally {
            this.A05 = false;
        }
    }

    private void A01(long j) {
        String path;
        if (this.A0G || (path = this.A0O) == null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("segmentingMuxer_");
            A0u.append(this.A06);
            A0u.append("_");
            A0u.append(System.currentTimeMillis());
            A0u.append("_");
            path = File.createTempFile(AnonymousClass000.A0q(this.A0B.name(), A0u), ".mp4", (File) null).getPath();
        }
        boolean z = this.A0I;
        C107725Qp r5 = new C107725Qp(path, z);
        this.A09 = r5;
        boolean z2 = this.A0H;
        Map map = this.A04;
        C122165uP r4 = new C122165uP();
        r4.A00 = -1;
        if (z2) {
            r4.A03 = true;
            r4.A01 = "1000000";
        }
        if (map != null) {
            r4.A02 = map;
        }
        C160907lm B4j = this.A0D.B4j(new C118675oY(r4.A02, r4.A03));
        this.A0C = B4j;
        if (z) {
            C141236mt r0 = new C141236mt(r5, B4j);
            this.A0C = r0;
            B4j = r0;
        }
        B4j.B3Q(r5.getPath());
        MediaFormat mediaFormat = this.A02;
        if (mediaFormat != null) {
            this.A0C.BqF(mediaFormat);
            this.A07 = j;
        }
        MediaFormat mediaFormat2 = this.A03;
        if (mediaFormat2 != null) {
            this.A0C.Bsh(mediaFormat2);
            this.A0C.BrP(this.A00);
            this.A01 = j;
        }
        this.A0C.start();
        this.A06++;
        this.A08 = 0;
    }

    private void A02(C160907lm r24, long j, boolean z) {
        if (r24 != null) {
            C118695oa r1 = this.A0N;
            C107725Qp r11 = this.A09;
            AnonymousClass5TE r10 = this.A0B;
            MediaFormat mediaFormat = this.A03;
            AnonymousClass6ED r2 = r1.A01;
            boolean z2 = z;
            r2.A03 = z2;
            C125085zI r3 = r2.A0F;
            if (r3.A09 != null) {
                AnonymousClass65N r0 = r1.A00;
                long j2 = r0.A08;
                long length = r11.length();
                int i = r0.A05;
                int i2 = r0.A03;
                long j3 = r0.A06;
                AnonymousClass6OY r9 = r3.A04;
                C131456Pc r8 = r2.A0B;
                AnonymousClass6D7 r7 = null;
                if (r10 == AnonymousClass5TE.AUDIO) {
                    AnonymousClass6VP r32 = r2.A0D;
                    if (r32 != null) {
                        r7 = r32.A03;
                    }
                } else {
                    C160937lp r33 = r2.A0H;
                    if (r33 != null) {
                        r7 = r33.BDz();
                    }
                }
                r2.A0I.add(new AnonymousClass6EC(mediaFormat, r7, r8, r9, r10, r11, i, i2, j2, length, j3, j, z2));
            }
        }
    }

    public static void A03(C141246mu r2, boolean z) {
        C160907lm r1 = r2.A0C;
        C107725Qp r22 = r2.A09;
        if (r1 != null && r1.BNK()) {
            try {
                r1.stop();
                if (z) {
                    r22.delete();
                }
            } catch (RuntimeException e) {
                if (r22.exists()) {
                    r22.A00();
                }
                throw C90524aI.A0e("Cannot stop the muxer", e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r3.A03 != null) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void start() {
        /*
            r3 = this;
            android.media.MediaFormat r0 = r3.A02
            r2 = 1
            if (r0 != 0) goto L_0x000a
            android.media.MediaFormat r0 = r3.A03
            r1 = 0
            if (r0 == 0) goto L_0x000b
        L_0x000a:
            r1 = 1
        L_0x000b:
            r0 = 0
            X.C131736Qi.A02(r1, r0)
            r0 = -1
            r3.A01(r0)
            r3.A05 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C141246mu.start():void");
    }

    public C141246mu(AnonymousClass65N r8, C131456Pc r9, C109635Yi r10, AnonymousClass5TE r11, C159097io r12, C118695oa r13, AnonymousClass65W r14, String str, long j, long j2, long j3, boolean z, boolean z2) {
        this.A0N = r13;
        this.A0M = r10;
        this.A0D = r12;
        this.A0L = j;
        this.A0K = j2;
        this.A0J = j3;
        this.A0B = r11;
        this.A0I = z;
        this.A0H = z2;
        this.A0A = r9;
        this.A0F = r14;
        if (!z || z2) {
            this.A0G = AnonymousClass000.A1R((j > j2 ? 1 : (j == j2 ? 0 : -1)));
            HashMap A0J2 = AnonymousClass001.A0J();
            this.A04 = A0J2;
            this.A0O = str;
            if (!A0J2.containsKey("copyright")) {
                String str2 = r8.A0E;
                if (str2 == null) {
                    HashMap hashMap = r8.A0J;
                    if (hashMap != null) {
                        Iterator A10 = C36391kE.A10(hashMap);
                        loop0:
                        while (true) {
                            if (!A10.hasNext()) {
                                break;
                            }
                            Iterator A102 = C36391kE.A10((AbstractMap) A10.next());
                            while (true) {
                                if (A102.hasNext()) {
                                    Iterator A13 = C90514aH.A13(A102.next());
                                    while (true) {
                                        if (A13.hasNext()) {
                                            str2 = ((AnonymousClass65N) A13.next()).A0E;
                                            if (str2 != null) {
                                                break loop0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (!A00(str2).equals(C023109s.A0C)) {
                    A0J2.put("copyright", str2);
                }
            }
            Map map = this.A04;
            if (!map.containsKey("composer")) {
                String str3 = r8.A0D;
                if (str3 == null) {
                    HashMap hashMap2 = r8.A0J;
                    if (hashMap2 != null) {
                        Iterator A103 = C36391kE.A10(hashMap2);
                        loop3:
                        while (A103.hasNext()) {
                            Iterator A104 = C36391kE.A10((AbstractMap) A103.next());
                            while (true) {
                                if (A104.hasNext()) {
                                    Iterator A132 = C90514aH.A13(A104.next());
                                    while (true) {
                                        if (A132.hasNext()) {
                                            str3 = ((AnonymousClass65N) A132.next()).A0D;
                                            if (str3 != null) {
                                                break loop3;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                if (!A00(str3).equals(C023109s.A0C)) {
                    map.put("composer", str3);
                    return;
                }
                return;
            }
            return;
        }
        throw AnonymousClass001.A08("Streaming mode can be used only with fragmented files");
    }

    public boolean BNK() {
        return this.A05;
    }

    public void BxZ(C159937kC r7) {
        MediaCodec.BufferInfo B91 = r7.B91();
        if (this.A07 == -1) {
            this.A07 = B91.presentationTimeUs;
        }
        this.A0C.BxZ(r7);
        long j = this.A08 + ((long) r7.B91().size);
        this.A08 = j;
        this.A0A.A01 = j;
    }

    public void Bxg(C159937kC r9) {
        MediaCodec.BufferInfo B91 = r9.B91();
        if (this.A01 == -1) {
            this.A01 = B91.presentationTimeUs;
        }
        if ((B91.flags & 2) != 0) {
            this.A0E.A00.add(new C141186mo(r9));
        }
        if ((B91.flags & 1) != 0) {
            long j = B91.presentationTimeUs;
            boolean A1U = C36401kF.A1U(((j - this.A01) > this.A0K ? 1 : ((j - this.A01) == this.A0K ? 0 : -1)));
            if (this.A0L - j >= this.A0J && A1U) {
                A03(this, false);
                A02(this.A0C, B91.presentationTimeUs - this.A01, false);
                A01(B91.presentationTimeUs);
                C114975i8 r0 = this.A0E;
                C160907lm r2 = this.A0C;
                for (C159937kC Bxg : r0.A00) {
                    r2.Bxg(Bxg);
                }
            }
        }
        B91.presentationTimeUs -= this.A01;
        this.A0C.Bxg(r9);
        long j2 = this.A08 + ((long) B91.size);
        this.A08 = j2;
        this.A0A.A01 = j2;
    }

    public void BqF(MediaFormat mediaFormat) {
        this.A02 = mediaFormat;
    }

    public void BrP(int i) {
        this.A00 = i;
    }

    public void Bsh(MediaFormat mediaFormat) {
        this.A03 = mediaFormat;
    }
}
