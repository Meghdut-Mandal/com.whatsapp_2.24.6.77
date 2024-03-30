package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9uj  reason: invalid class name and case insensitive filesystem */
public class C207209uj implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C23181B8p(21);
    public final long A00;
    public final Jid A01;
    public final Jid A02;
    public final UserJid A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;

    public int describeContents() {
        return 0;
    }

    public UserJid A00() {
        return C36401kF.A0b(AnonymousClass143.A00(this.A01));
    }

    public C203399nx A01() {
        if (!(this instanceof C180888ma)) {
            return null;
        }
        C180888ma r10 = (C180888ma) this;
        long j = r10.A00;
        if (j <= 0 && r10.A01 <= 0) {
            return null;
        }
        DeviceJid deviceJid = r10.A02;
        int i = 1;
        long j2 = r10.A01;
        AnonymousClass1AL[] r7 = new AnonymousClass1AL[((AnonymousClass000.A1V(deviceJid) ? 1 : 0) + true + (AnonymousClass000.A1R((j > 0 ? 1 : (j == 0 ? 0 : -1))) ? 1 : 0) + (AnonymousClass000.A1R((j2 > 0 ? 1 : (j2 == 0 ? 0 : -1))) ? 1 : 0))];
        C36341k9.A1L("call-id", r10.A03, r7, 0);
        if (deviceJid != null) {
            C90504aG.A1E(deviceJid, "call-creator", r7, 1);
            i = 2;
        }
        if (j > 0) {
            C36341k9.A1L("audio_duration", String.valueOf(j), r7, i);
            i++;
        }
        if (j2 > 0) {
            C36341k9.A1L("video_duration", String.valueOf(j2), r7, i);
        }
        return C203399nx.A04("terminate", r7);
    }

    public AnonymousClass9YT A02() {
        AnonymousClass9YT r4 = new AnonymousClass9YT();
        r4.A02 = this.A02;
        r4.A05 = this.A05;
        r4.A07 = this.A07;
        r4.A08 = this.A08;
        r4.A04 = this.A04;
        r4.A01 = this.A01;
        r4.A03 = this.A03;
        r4.A06 = this.A06;
        r4.A00 = this.A00;
        List<AnonymousClass1AL> list = this.A09;
        if (list != null) {
            for (AnonymousClass1AL r2 : list) {
                r4.A09.put(r2.A02, r2);
            }
        }
        return r4;
    }

    public String A03() {
        List<AnonymousClass1AL> list = this.A09;
        if (list != null) {
            for (AnonymousClass1AL r1 : list) {
                if (r1.A02.equals("error")) {
                    return r1.A03;
                }
            }
        }
        return null;
    }

    public boolean A04() {
        String str = this.A05;
        if ("message".equals(str) || "notification".equals(str) || "call".equals(str) || "receipt".equals(str)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r0 != null) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            if (r3 != r4) goto L_0x0004
            r0 = 1
            return r0
        L_0x0004:
            r2 = 0
            if (r4 == 0) goto L_0x001b
            java.lang.Class r1 = r3.getClass()
            java.lang.Class r0 = r4.getClass()
            if (r1 != r0) goto L_0x001b
            X.9uj r4 = (X.C207209uj) r4
            java.lang.String r1 = r3.A05
            java.lang.String r0 = r4.A05
            if (r1 != 0) goto L_0x001c
            if (r0 == 0) goto L_0x0023
        L_0x001b:
            return r2
        L_0x001c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0023
            return r2
        L_0x0023:
            com.whatsapp.jid.Jid r1 = r3.A02
            com.whatsapp.jid.Jid r0 = r4.A02
            if (r1 != 0) goto L_0x002c
            if (r0 == 0) goto L_0x0033
            return r2
        L_0x002c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0033
            return r2
        L_0x0033:
            java.lang.String r1 = r3.A07
            java.lang.String r0 = r4.A07
            if (r1 != 0) goto L_0x003c
            if (r0 == 0) goto L_0x0043
            return r2
        L_0x003c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0043
            return r2
        L_0x0043:
            com.whatsapp.jid.Jid r1 = r3.A01
            com.whatsapp.jid.Jid r0 = r4.A01
            if (r1 != 0) goto L_0x004c
            if (r0 == 0) goto L_0x0053
            return r2
        L_0x004c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0053
            return r2
        L_0x0053:
            com.whatsapp.jid.UserJid r1 = r3.A03
            com.whatsapp.jid.UserJid r0 = r4.A03
            if (r1 != 0) goto L_0x005c
            if (r0 == 0) goto L_0x0063
            return r2
        L_0x005c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0063
            return r2
        L_0x0063:
            java.lang.String r1 = r3.A08
            java.lang.String r0 = r4.A08
            if (r1 != 0) goto L_0x006c
            if (r0 == 0) goto L_0x0073
            return r2
        L_0x006c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0073
            return r2
        L_0x0073:
            java.lang.String r1 = r3.A06
            java.lang.String r0 = r4.A06
            if (r1 != 0) goto L_0x007c
            if (r0 == 0) goto L_0x0083
            return r2
        L_0x007c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0083
            return r2
        L_0x0083:
            java.util.List r1 = r3.A09
            java.util.List r0 = r4.A09
            if (r1 != 0) goto L_0x008c
            if (r0 == 0) goto L_0x0093
            return r2
        L_0x008c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0093
            return r2
        L_0x0093:
            java.lang.String r1 = r3.A04
            java.lang.String r0 = r4.A04
            boolean r0 = X.C1901797e.A00(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C207209uj.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode;
        int A092 = (((((((((((((C36341k9.A09(this.A05) + 31) * 31) + AnonymousClass000.A0H(this.A02)) * 31) + C36341k9.A09(this.A07)) * 31) + AnonymousClass000.A0H(this.A01)) * 31) + AnonymousClass000.A0H(this.A03)) * 31) + C36341k9.A09(this.A08)) * 31) + C36341k9.A09(this.A06)) * 31;
        List list = this.A09;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return ((A092 + hashCode) * 31) + C36421kH.A05(this.A04);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A06);
        parcel.writeTypedList(this.A09);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A00);
    }

    public C207209uj(Parcel parcel) {
        Class<Jid> cls = Jid.class;
        this.A02 = (Jid) C36411kG.A0H(parcel, cls);
        this.A05 = parcel.readString();
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A01 = (Jid) C36411kG.A0H(parcel, cls);
        this.A03 = (UserJid) C36411kG.A0H(parcel, UserJid.class);
        this.A06 = parcel.readString();
        this.A09 = parcel.createTypedArrayList(AnonymousClass1AL.CREATOR);
        this.A04 = parcel.readString();
        this.A00 = parcel.readLong();
    }

    public String toString() {
        String A0l;
        String A0p;
        String A0p2;
        String A0p3;
        String A0p4;
        String A0l2;
        String A0l3;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[StanzaKey");
        Jid jid = this.A02;
        String str = "";
        if (jid == null) {
            A0l = str;
        } else {
            A0l = AnonymousClass000.A0l(jid, " remoteJid=", AnonymousClass000.A0u());
        }
        A0u.append(A0l);
        String str2 = this.A05;
        if (str2 == null) {
            A0p = str;
        } else {
            A0p = AnonymousClass000.A0p(" cls=", str2, AnonymousClass000.A0u());
        }
        A0u.append(A0p);
        String str3 = this.A07;
        if (str3 == null) {
            A0p2 = str;
        } else {
            A0p2 = AnonymousClass000.A0p(" id=", str3, AnonymousClass000.A0u());
        }
        A0u.append(A0p2);
        String str4 = this.A08;
        if (str4 == null) {
            A0p3 = str;
        } else {
            A0p3 = AnonymousClass000.A0p(" type=", str4, AnonymousClass000.A0u());
        }
        A0u.append(A0p3);
        String str5 = this.A04;
        if (str5 == null) {
            A0p4 = str;
        } else {
            A0p4 = AnonymousClass000.A0p(" category=", str5, AnonymousClass000.A0u());
        }
        A0u.append(A0p4);
        Jid jid2 = this.A01;
        if (jid2 == null) {
            A0l2 = str;
        } else {
            A0l2 = AnonymousClass000.A0l(jid2, " participant=", AnonymousClass000.A0u());
        }
        A0u.append(A0l2);
        UserJid userJid = this.A03;
        if (userJid == null) {
            A0l3 = str;
        } else {
            A0l3 = AnonymousClass000.A0l(userJid, " recipient=", AnonymousClass000.A0u());
        }
        A0u.append(A0l3);
        String str6 = this.A06;
        if (str6 != null) {
            str = AnonymousClass000.A0p(" editVersion=", str6, AnonymousClass000.A0u());
        }
        A0u.append(str);
        A0u.append(" loggableStanzaId=");
        A0u.append(this.A00);
        return C90474aD.A0g(A0u);
    }

    public C207209uj(C207209uj r3) {
        ArrayList arrayList;
        this.A02 = r3.A02;
        this.A05 = r3.A05;
        this.A07 = r3.A07;
        this.A08 = r3.A08;
        this.A04 = r3.A04;
        this.A01 = r3.A01;
        this.A03 = r3.A03;
        this.A06 = r3.A06;
        this.A00 = r3.A00;
        List list = r3.A09;
        if (list != null) {
            arrayList = C36441kJ.A15(list);
        } else {
            arrayList = null;
        }
        this.A09 = arrayList;
    }

    public C207209uj(Jid jid, Jid jid2, UserJid userJid, String str, String str2, String str3, String str4, String str5, List list, long j) {
        this.A02 = jid;
        this.A05 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A04 = str4;
        this.A01 = jid2;
        this.A03 = userJid;
        this.A06 = str5;
        this.A00 = j;
        this.A09 = list;
    }
}
