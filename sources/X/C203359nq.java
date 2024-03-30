package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.SerializableLocation;
import com.whatsapp.SerializablePoint;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.9nq  reason: invalid class name and case insensitive filesystem */
public abstract class C203359nq {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A05(X.AnonymousClass8SE r4) {
        /*
            int r1 = r4.bitField0_
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1P(r1)
            r3 = 0
            if (r0 == 0) goto L_0x002d
            int r1 = r4.gifAttribution_
            if (r1 == 0) goto L_0x0031
            r0 = 1
            if (r1 == r0) goto L_0x002e
            r0 = 2
            if (r1 != r0) goto L_0x0031
            X.90e r2 = X.C1886690e.TENOR
        L_0x0018:
            int r1 = r2.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0034
            r0 = 2
            if (r1 == r0) goto L_0x0034
            if (r1 == r3) goto L_0x002d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MessageUtil/getGifAttribution/error: Unexpected gif attribution="
            X.C36321k7.A1J(r2, r0, r1)
        L_0x002d:
            return r3
        L_0x002e:
            X.90e r2 = X.C1886690e.GIPHY
            goto L_0x0018
        L_0x0031:
            X.90e r2 = X.C1886690e.NONE
            goto L_0x0018
        L_0x0034:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203359nq.A05(X.8SE):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r11.A0E(6442) == false) goto L_0x0013;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f4 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A07(X.C65013Qj r10, X.C20810yC r11, boolean r12) {
        /*
            com.whatsapp.InteractiveAnnotation[] r0 = r10.A0b
            if (r0 == 0) goto L_0x0191
            int r0 = r0.length
            if (r0 == 0) goto L_0x0191
            r4 = 0
            if (r12 != 0) goto L_0x0013
            r0 = 6442(0x192a, float:9.027E-42)
            boolean r0 = r11.A0E(r0)
            r12 = 1
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r12 = 0
        L_0x0014:
            com.whatsapp.InteractiveAnnotation[] r7 = r10.A0b
            int r6 = r7.length
            java.util.ArrayList r5 = X.C36441kJ.A14(r6)
        L_0x001b:
            if (r4 >= r6) goto L_0x0190
            r3 = r7[r4]
            X.8Qf r0 = X.C173058Qf.DEFAULT_INSTANCE
            X.8NN r11 = r0.A0p()
            r9 = 0
        L_0x0026:
            com.whatsapp.SerializablePoint[] r1 = r3.polygonVertices
            int r0 = r1.length
            if (r9 >= r0) goto L_0x007f
            r0 = r1[r9]
            if (r0 == 0) goto L_0x007c
            X.8Qm r0 = X.C173128Qm.DEFAULT_INSTANCE
            X.8NN r10 = r0.A0p()
            com.whatsapp.SerializablePoint[] r0 = r3.polygonVertices
            r0 = r0[r9]
            double r0 = r0.x
            X.8Hz r8 = X.C90524aI.A0H(r10)
            X.8Qm r8 = (X.C173128Qm) r8
            int r2 = r8.bitField0_
            r2 = r2 | 4
            r8.bitField0_ = r2
            r8.x_ = r0
            com.whatsapp.SerializablePoint[] r0 = r3.polygonVertices
            r0 = r0[r9]
            double r0 = r0.y
            X.8Hz r8 = X.C90524aI.A0H(r10)
            X.8Qm r8 = (X.C173128Qm) r8
            int r2 = r8.bitField0_
            r2 = r2 | 8
            r8.bitField0_ = r2
            r8.y_ = r0
            X.8Hz r8 = r10.A0R()
            X.8Hz r2 = X.C90524aI.A0H(r11)
            X.8Qf r2 = (X.C173058Qf) r2
            r8.getClass()
            X.B6c r1 = r2.polygonVertices_
            r0 = r1
            X.AcE r0 = (X.C21886AcE) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0079
            X.B6c r1 = X.C170918Hz.A0A(r1)
            r2.polygonVertices_ = r1
        L_0x0079:
            r1.add(r8)
        L_0x007c:
            int r9 = r9 + 1
            goto L_0x0026
        L_0x007f:
            boolean r0 = r3.skipConfirmation
            if (r0 == 0) goto L_0x0092
            X.8Hz r2 = X.C90524aI.A0H(r11)
            X.8Qf r2 = (X.C173058Qf) r2
            r1 = 1
            int r0 = r2.bitField0_
            r0 = r0 | 4
            r2.bitField0_ = r0
            r2.shouldSkipConfirmation_ = r1
        L_0x0092:
            java.lang.Object r2 = r3.data
            boolean r0 = r2 instanceof com.whatsapp.SerializableLocation
            if (r0 == 0) goto L_0x00f8
            com.whatsapp.SerializableLocation r2 = (com.whatsapp.SerializableLocation) r2
            X.8Pq r0 = X.C172908Pq.DEFAULT_INSTANCE
            X.8NN r10 = r0.A0p()
            double r0 = r2.latitude
            X.8Hz r9 = X.C90524aI.A0H(r10)
            X.8Pq r9 = (X.C172908Pq) r9
            int r8 = r9.bitField0_
            r8 = r8 | 1
            r9.bitField0_ = r8
            r9.degreesLatitude_ = r0
            double r0 = r2.longitude
            X.8Hz r9 = X.C90524aI.A0H(r10)
            X.8Pq r9 = (X.C172908Pq) r9
            int r8 = r9.bitField0_
            r8 = r8 | 2
            r9.bitField0_ = r8
            r9.degreesLongitude_ = r0
            java.lang.String r2 = r2.name
            X.8Hz r1 = X.C90524aI.A0H(r10)
            X.8Pq r1 = (X.C172908Pq) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.name_ = r2
            X.8Hz r1 = X.C90524aI.A0H(r11)
            X.8Qf r1 = (X.C173058Qf) r1
            X.8Hz r0 = r10.A0R()
            r0.getClass()
            r1.action_ = r0
            r0 = 2
        L_0x00e3:
            r1.actionCase_ = r0
        L_0x00e5:
            if (r12 != 0) goto L_0x00ed
            java.lang.Object r0 = r3.data
            boolean r0 = r0 instanceof com.whatsapp.SerializableLocation
            if (r0 == 0) goto L_0x00f4
        L_0x00ed:
            X.8Hz r0 = r11.A0R()
            r5.add(r0)
        L_0x00f4:
            int r4 = r4 + 1
            goto L_0x001b
        L_0x00f8:
            boolean r0 = r2 instanceof X.C63393Jw
            if (r0 == 0) goto L_0x00e5
            X.3Jw r2 = (X.C63393Jw) r2
            X.8RA r0 = X.AnonymousClass8RA.DEFAULT_INSTANCE
            X.8NN r9 = r0.A0p()
            X.1Uw r0 = r2.A01
            java.lang.String r8 = r0.getObfuscatedString()
            X.8Hz r1 = X.C90524aI.A0H(r9)
            X.8RA r1 = (X.AnonymousClass8RA) r1
            r8.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.newsletterJid_ = r8
            java.lang.String r8 = r2.A04
            X.8Hz r1 = X.C90524aI.A0H(r9)
            X.8RA r1 = (X.AnonymousClass8RA) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.newsletterName_ = r8
            int r8 = r2.A00
            if (r8 <= 0) goto L_0x013d
            X.8Hz r1 = X.C90524aI.A0H(r9)
            X.8RA r1 = (X.AnonymousClass8RA) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.serverMessageId_ = r8
        L_0x013d:
            X.2pG r0 = r2.A02
            if (r0 == 0) goto L_0x0160
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0188
            r0 = 1
            if (r1 == r0) goto L_0x0185
            r0 = 2
            if (r1 != r0) goto L_0x018b
            X.2q4 r0 = X.C52722q4.LINK_CARD
        L_0x0150:
            X.8Hz r1 = X.C90524aI.A0H(r9)
            X.8RA r1 = (X.AnonymousClass8RA) r1
            int r0 = r0.value
            r1.contentType_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
        L_0x0160:
            java.lang.String r2 = r2.A03
            X.8Hz r1 = X.C90524aI.A0H(r9)
            X.8RA r1 = (X.AnonymousClass8RA) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.accessibilityText_ = r2
            X.8Hz r1 = X.C90524aI.A0H(r11)
            X.8Qf r1 = (X.C173058Qf) r1
            X.8Hz r0 = r9.A0R()
            r0.getClass()
            r1.action_ = r0
            r0 = 3
            goto L_0x00e3
        L_0x0185:
            X.2q4 r0 = X.C52722q4.UPDATE_CARD
            goto L_0x0150
        L_0x0188:
            X.2q4 r0 = X.C52722q4.UPDATE
            goto L_0x0150
        L_0x018b:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x0190:
            return r5
        L_0x0191:
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203359nq.A07(X.3Qj, X.0yC, boolean):java.util.ArrayList");
    }

    public static void A0A(C20810yC r2, AnonymousClass8NL r3) {
        if (C20800yB.A01(C21000yV.A01, r2, 7772)) {
            AnonymousClass8SX A0E = AnonymousClass8NN.A0E(r3);
            int i = AnonymousClass8SX.AUDIO_MESSAGE_FIELD_NUMBER;
            A0E.messageContextInfo_ = null;
            A0E.bitField0_ &= -67108865;
        }
    }

    public static boolean A0B(C65663Sz r5, AnonymousClass3T1 r6) {
        long j;
        long j2 = r6.A1O;
        synchronized (r5) {
            j = r5.A05;
        }
        return C90484aE.A1Q((j2 > j ? 1 : (j2 == j ? 0 : -1)));
    }

    public static boolean A0C(AnonymousClass3T1 r2) {
        int i = r2.A1I;
        if (i == 11 || i == 31 || i == 95 || i == 96 || i == 98) {
            return true;
        }
        return false;
    }

    public static Pair A06(DeviceJid deviceJid, Jid jid, Jid jid2) {
        if (AnonymousClass143.A0G(jid) || (jid instanceof C177618e5)) {
            if (deviceJid != null) {
                jid2 = deviceJid;
            }
        } else if (jid2 instanceof C177618e5) {
            if (deviceJid != null) {
                jid = deviceJid;
            }
            Jid jid3 = jid2;
            jid2 = jid;
            jid = jid3;
        } else if (deviceJid != null) {
            jid = deviceJid;
        }
        return C36441kJ.A0Q(jid, jid2);
    }

    public static LinkedList A08(List list) {
        Integer num;
        Object obj;
        C172908Pq r0;
        C52722q4 r02;
        LinkedList A0l = C90524aI.A0l();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C173058Qf r7 = (C173058Qf) it.next();
            SerializablePoint[] serializablePointArr = new SerializablePoint[r7.polygonVertices_.size()];
            int i = 0;
            while (true) {
                if (i < r7.polygonVertices_.size()) {
                    C173128Qm r6 = (C173128Qm) r7.polygonVertices_.get(i);
                    int i2 = r6.bitField0_;
                    if ((i2 & 1) == 0 && (i2 & 2) == 0) {
                        serializablePointArr[i] = new SerializablePoint(r6.x_, r6.y_);
                        i++;
                    } else {
                        Log.i("MessageUtils/buildE2eMessage/info contains deprecated point");
                    }
                } else {
                    int i3 = r7.actionCase_;
                    if (i3 == 0) {
                        num = C023109s.A0C;
                    } else if (i3 == 2) {
                        num = C023109s.A00;
                    } else if (i3 != 3) {
                        num = null;
                    } else {
                        num = C023109s.A01;
                    }
                    boolean z = r7.shouldSkipConfirmation_;
                    int intValue = num.intValue();
                    if (intValue == 0) {
                        if (i3 == 2) {
                            r0 = (C172908Pq) r7.action_;
                        } else {
                            r0 = C172908Pq.DEFAULT_INSTANCE;
                        }
                        obj = new SerializableLocation(r0.name_, r0.degreesLatitude_, r0.degreesLongitude_);
                    } else if (intValue == 1 && i3 == 3) {
                        AnonymousClass8RA r5 = (AnonymousClass8RA) r7.action_;
                        C28981Uw A01 = C28981Uw.A03.A01(r5.newsletterJid_);
                        if (A01 == null) {
                            Log.w("MessageUtils/getForwardedNewsletterMessageInfo/error invalid newsletter jid");
                        } else {
                            int i4 = r5.serverMessageId_;
                            String str = r5.newsletterName_;
                            int i5 = r5.contentType_;
                            if (i5 != 1) {
                                if (i5 == 2) {
                                    r02 = C52722q4.UPDATE_CARD;
                                } else if (i5 == 3) {
                                    r02 = C52722q4.LINK_CARD;
                                }
                                obj = new C63393Jw(A01, C55152uA.A00(Integer.valueOf(r02.value)), str, r5.accessibilityText_, i4);
                            }
                            r02 = C52722q4.UPDATE;
                            obj = new C63393Jw(A01, C55152uA.A00(Integer.valueOf(r02.value)), str, r5.accessibilityText_, i4);
                        }
                    }
                    A0l.add(new InteractiveAnnotation(obj, serializablePointArr, z));
                }
            }
            Log.i("MessageUtils/buildE2eMessage/info contains deprecated point");
        }
        return A0l;
    }

    public static void A09(C65013Qj r2, C20810yC r3, List list, List list2) {
        ArrayList A0I = AnonymousClass001.A0I();
        if (r3.A0E(6444)) {
            A0I.addAll(A08(list2));
        }
        if (A0I.isEmpty()) {
            A0I.addAll(A08(list));
        }
        if (!A0I.isEmpty()) {
            r2.A0b = (InteractiveAnnotation[]) A0I.toArray(new InteractiveAnnotation[0]);
        }
    }

    public static boolean A0D(C64933Qa r5, String str) {
        StringBuilder A0u;
        String str2;
        if (TextUtils.isEmpty(str)) {
            A0u = AnonymousClass000.A0u();
            A0u.append("MessageUtil/isValidMediaUrl/error empty media url received. message.key=");
        } else {
            Uri parse = Uri.parse(str);
            if (!"https".equalsIgnoreCase(parse.getScheme())) {
                A0u = AnonymousClass000.A0u();
                str2 = "MessageUtil/isValidMediaUrl/error invalid scheme on received media url; url=";
            } else if (!TextUtils.isEmpty(parse.getHost()) && parse.getHost().endsWith(".whatsapp.net")) {
                return true;
            } else {
                A0u = AnonymousClass000.A0u();
                str2 = "MessageUtil/isValidMediaUrl/error invalid host on received media url; url=";
            }
            AnonymousClass000.A1D(str2, str, "; message.key=", A0u);
        }
        C36351kA.A1L(r5, A0u);
        return false;
    }
}
