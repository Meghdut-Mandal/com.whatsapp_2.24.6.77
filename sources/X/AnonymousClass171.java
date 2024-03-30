package X;

import android.content.Context;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.171  reason: invalid class name */
public class AnonymousClass171 {
    public final C19730wQ A00;
    public final C19630wG A01;
    public final C18820ts A02;
    public final C220412q A03;
    public final C20810yC A04;
    public final AnonymousClass005 A05;
    public final AnonymousClass005 A06;
    public final ConcurrentHashMap A07 = new ConcurrentHashMap();
    public final ConcurrentHashMap A08 = new ConcurrentHashMap();
    public final C19700wN A09;
    public final C20500xf A0A;
    public final AnonymousClass005 A0B;
    public final AnonymousClass005 A0C;
    public final AnonymousClass005 A0D;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        if ((r11 instanceof X.C177538dx) != false) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A04(X.AnonymousClass171 r10, X.AnonymousClass144 r11, int r12, boolean r13) {
        /*
            r5 = r10
            if (r13 == 0) goto L_0x0068
            java.util.concurrent.ConcurrentHashMap r2 = r10.A08
        L_0x0005:
            java.lang.Object r0 = r2.get(r11)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0081
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            X.005 r3 = r10.A0C
            java.lang.Object r0 = r3.get()
            X.17X r0 = (X.AnonymousClass17X) r0
            X.17r r0 = r0.A07
            X.6X6 r1 = r0.A0C(r11)
            java.lang.Object r0 = r3.get()
            X.17X r0 = (X.AnonymousClass17X) r0
            boolean r0 = r0.A0B(r11)
            if (r0 == 0) goto L_0x0063
            java.util.Map r0 = r1.A07
            java.util.Collection r0 = r0.values()
            X.0y7 r0 = X.C20760y7.copyOf((java.util.Collection) r0)
        L_0x0036:
            X.14x r4 = r0.iterator()
            r3 = 0
        L_0x003b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r1 = r4.next()
            X.6PM r1 = (X.AnonymousClass6PM) r1
            X.0wQ r0 = r10.A00
            com.whatsapp.jid.UserJid r1 = r1.A03
            boolean r0 = r0.A0M(r1)
            if (r0 == 0) goto L_0x0053
            r3 = 1
            goto L_0x003b
        L_0x0053:
            X.005 r0 = r10.A05
            java.lang.Object r0 = r0.get()
            X.16D r0 = (X.AnonymousClass16D) r0
            X.141 r0 = r0.A0D(r1)
            r6.add(r0)
            goto L_0x003b
        L_0x0063:
            X.0y7 r0 = r1.A07()
            goto L_0x0036
        L_0x0068:
            java.util.concurrent.ConcurrentHashMap r2 = r10.A07
            goto L_0x0005
        L_0x006b:
            r7 = -1
            if (r13 == 0) goto L_0x0070
            r7 = 10
        L_0x0070:
            if (r3 == 0) goto L_0x0077
            boolean r0 = r11 instanceof X.C177538dx
            r9 = 1
            if (r0 == 0) goto L_0x0078
        L_0x0077:
            r9 = 0
        L_0x0078:
            r10 = 0
            r8 = r12
            java.lang.String r0 = r5.A0Y(r6, r7, r8, r9, r10)
            r2.put(r11, r0)
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass171.A04(X.171, X.144, int, boolean):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r5.A0G == null) goto L_0x0008;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A07(X.AnonymousClass141 r5, X.AnonymousClass11F r6) {
        /*
            r4 = this;
            r3 = 1
            if (r5 == 0) goto L_0x0008
            X.141 r1 = r5.A0G
            r0 = 1
            if (r1 != 0) goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            if (r6 == 0) goto L_0x0058
            if (r0 != 0) goto L_0x0058
            X.12q r0 = r4.A03
            boolean r0 = r0.A0O(r6)
            if (r0 != 0) goto L_0x004f
            X.005 r0 = r4.A06
            java.lang.Object r1 = r0.get()
            X.1dw r1 = (X.C32631dw) r1
            boolean r0 = X.AnonymousClass143.A0G(r6)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r6 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x0058
            X.12q r0 = r1.A00
            boolean r0 = r0.A0O(r6)
            if (r0 != 0) goto L_0x004f
            X.17X r0 = r1.A01
            X.144 r6 = (X.AnonymousClass144) r6
            X.17r r0 = r0.A07
            X.6X6 r2 = r0.A0C(r6)
            int r1 = r2.A00
            r0 = 3
            if (r0 != r1) goto L_0x0051
            java.util.Map r0 = r2.A07
            java.util.Collection r0 = r0.values()
            X.0y7 r0 = X.C20760y7.copyOf((java.util.Collection) r0)
            int r1 = r0.size()
        L_0x004c:
            r0 = 3
            if (r1 < r0) goto L_0x0058
        L_0x004f:
            r0 = 7
            return r0
        L_0x0051:
            java.util.Map r0 = r2.A08
            int r1 = r0.size()
            goto L_0x004c
        L_0x0058:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass171.A07(X.141, X.11F):int");
    }

    public AnonymousClass34G A0D(AnonymousClass141 r4, int i, boolean z) {
        if (z || r4.A0F == null || TextUtils.isEmpty(r4.A0R) || r4.A0N()) {
            return A0E(r4, i, false, true);
        }
        return new AnonymousClass34G(C52022ol.GIVEN_NAME, r4.A0R);
    }

    public String A0H(AnonymousClass141 r3) {
        return A0R(r3, -1, false);
    }

    public String A0Q(AnonymousClass141 r2, int i) {
        return A0D(r2, i, false).A01;
    }

    public String A0R(AnonymousClass141 r2, int i, boolean z) {
        return A0E(r2, i, z, true).A01;
    }

    public String A0V(Iterable iterable) {
        boolean z;
        Iterable iterable2 = iterable;
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            AnonymousClass141 r0 = (AnonymousClass141) it.next();
            if (r0 != null) {
                if (this.A00.A0M(r0.A0H)) {
                    z = true;
                    break;
                }
            }
        }
        return A0Y(iterable2, 2, -1, z, true);
    }

    public String A0W(Iterable iterable, int i) {
        HashSet hashSet = new HashSet();
        return A0Y(hashSet, i, -1, A05(this, iterable, hashSet), true);
    }

    public String A0X(Iterable iterable, int i) {
        HashSet hashSet = new HashSet();
        return A0Y(hashSet, -1, i, A05(this, iterable, hashSet), true);
    }

    public ArrayList A0b(Iterable iterable, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AnonymousClass34G A0D2 = A0D((AnonymousClass141) it.next(), i, false);
            C52022ol r2 = A0D2.A00;
            String str = A0D2.A01;
            if (str != null) {
                if (r2 == C52022ol.PHONE_NUMBER) {
                    arrayList3.add(str);
                } else if (r2 == C52022ol.PUSH_NAME) {
                    arrayList2.add(str);
                } else {
                    arrayList.add(str);
                }
            }
        }
        Collections.sort(arrayList, A0Z());
        Collections.sort(arrayList2, A0Z());
        Collections.sort(arrayList3);
        arrayList.addAll(arrayList2);
        arrayList.addAll(arrayList3);
        if (z) {
            arrayList.add(this.A01.A00.getString(R.string.f12nameremoved));
        }
        return arrayList;
    }

    private int A00(C177538dx r4) {
        AnonymousClass6X6 A0C2 = ((AnonymousClass17X) this.A0C.get()).A07.A0C(r4);
        boolean A0O = A0C2.A0O(this.A00);
        int size = A0C2.A05().size();
        if (A0O) {
            return size - 1;
        }
        return size;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r5.A0G != null) goto L_0x000b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass34G A01(X.AnonymousClass171 r4, X.AnonymousClass141 r5, boolean r6) {
        /*
            X.11F r2 = r5.A0H
            boolean r0 = r2 instanceof X.C223313w
            if (r0 == 0) goto L_0x000b
            X.141 r1 = r5.A0G
            r0 = 1
            if (r1 == 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r3 = 0
            if (r0 == 0) goto L_0x0027
            X.0ts r1 = r4.A02
            java.lang.String r0 = r5.A0J()
        L_0x0015:
            java.lang.String r2 = r1.A0H(r0)
        L_0x0019:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x0039
            X.2ol r0 = X.C52022ol.UNKNOWN
            X.34G r1 = new X.34G
            r1.<init>(r0, r3)
            return r1
        L_0x0027:
            if (r6 == 0) goto L_0x0030
            X.0ts r1 = r4.A02
            java.lang.String r0 = X.AnonymousClass3U8.A03(r5)
            goto L_0x0015
        L_0x0030:
            if (r2 == 0) goto L_0x0037
            java.lang.String r2 = X.AnonymousClass3U8.A06(r2)
            goto L_0x0019
        L_0x0037:
            r2 = r3
            goto L_0x0019
        L_0x0039:
            X.2ol r0 = X.C52022ol.PHONE_NUMBER
            X.34G r1 = new X.34G
            r1.<init>(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass171.A01(X.171, X.141, boolean):X.34G");
    }

    public static String A02(Context context, C18820ts r3, AnonymousClass141 r4) {
        Integer num;
        int i;
        if ((r4.A0H instanceof C28981Uw) || (num = r4.A0L) == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return r4.A0V;
        }
        switch (intValue) {
            case 1:
                i = R.string.f12nameremoved;
                break;
            case 2:
                i = R.string.f12nameremoved;
                break;
            case 3:
                i = R.string.f12nameremoved;
                break;
            case 4:
                i = R.string.f12nameremoved;
                break;
            case 5:
                i = R.string.f12nameremoved;
                break;
            case 6:
                i = R.string.f12nameremoved;
                break;
            case 7:
                i = R.string.f12nameremoved;
                break;
            case 8:
                i = R.string.f12nameremoved;
                break;
            case 9:
                i = R.string.f12nameremoved;
                break;
            case 10:
                i = R.string.f12nameremoved;
                break;
            case 11:
                i = R.string.f12nameremoved;
                break;
            case 12:
                i = R.string.f12nameremoved;
                break;
            case 13:
                i = R.string.f12nameremoved;
                break;
            case 14:
                i = R.string.f12nameremoved;
                break;
            case 15:
                i = R.string.f12nameremoved;
                break;
            case 16:
                i = R.string.f12nameremoved;
                break;
            case 17:
                i = R.string.f12nameremoved;
                break;
            case 18:
                i = R.string.f12nameremoved;
                break;
            case 19:
                i = R.string.f12nameremoved;
                break;
            case 20:
                i = R.string.f12nameremoved;
                break;
            default:
                return r3.A00.getResources().getString(ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(intValue));
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf != null) {
            return context.getString(valueOf.intValue());
        }
        return r3.A00.getResources().getString(ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(intValue));
    }

    public static boolean A06(AnonymousClass141 r2) {
        if ((r2.A0H instanceof C177618e5) || !TextUtils.isEmpty(r2.A0J())) {
            return false;
        }
        if (!r2.A0C()) {
            return !TextUtils.isEmpty(r2.A0a);
        }
        if (r2.A0A() || TextUtils.isEmpty(r2.A0K())) {
            return false;
        }
        return true;
    }

    public int A09(AnonymousClass11F r4) {
        int A0B2 = ((AnonymousClass17X) this.A0C.get()).A07.A0B((AnonymousClass144) r4);
        if (A0B2 != -1) {
            C32631dw r1 = (C32631dw) this.A06.get();
            if (A0B2 >= 3 || r1.A00.A0O(r4)) {
                return 7;
            }
            return 1;
        }
        return 7;
    }

    public AnonymousClass34G A0B(C52022ol r4, AnonymousClass141 r5, int i) {
        String str;
        C52022ol r1;
        if (r4 == C52022ol.PHONE_NUMBER) {
            str = A03(this, r5, R.string.f12nameremoved);
            r1 = C52022ol.PUSH_NAME;
        } else if (r4 == C52022ol.PUSH_NAME && i == 7) {
            return A01(this, r5, true);
        } else {
            str = null;
            r1 = C52022ol.UNKNOWN;
        }
        return new AnonymousClass34G(r1, str);
    }

    public AnonymousClass34G A0C(AnonymousClass141 r4, int i) {
        boolean A0O;
        String A0S;
        AnonymousClass11F r2 = r4.A0H;
        if (r2 instanceof C28981Uw) {
            C44072La r0 = (C44072La) this.A03.A09(r2, false);
            if (r0 != null) {
                A0O = r0.A0P();
            }
            return A0E(r4, i, false, true);
        }
        A0O = r4.A0O();
        if (A0O) {
            AnonymousClass11F r22 = r4.A0H;
            if (r22 instanceof C28981Uw) {
                C44072La r02 = (C44072La) this.A03.A09(r22, false);
                if (r02 != null) {
                    A0S = r02.A0K;
                } else {
                    A0S = A0S(r4, false);
                }
            } else {
                A0S = A0S(r4, false);
            }
            return new AnonymousClass34G(C52022ol.VERIFIED_NAME, A0S);
        }
        return A0E(r4, i, false, true);
    }

    public AnonymousClass34G A0F(AnonymousClass141 r11, boolean z) {
        String str;
        C52022ol r0;
        String A0D2;
        String quantityString;
        C52022ol r1;
        C52022ol r02;
        int i;
        AnonymousClass11F r2 = r11.A0H;
        if (r2 instanceof C177528dw) {
            A0D2 = this.A01.A00.getString(R.string.f12nameremoved);
            r02 = C52022ol.MY_STATUS;
        } else {
            if (C197029b1.A00(r2)) {
                quantityString = r11.A0J();
                r1 = C52022ol.VERIFIED_NAME;
            } else if (!r11.A0E() || !C55942vR.A00(this.A04)) {
                if (r11.A0N() || (A0e(r11) && r11.A0C() && ((i = r11.A08) == 2 || i == 3))) {
                    str = A0S(r11, z);
                    r0 = C52022ol.VERIFIED_NAME;
                } else if (AnonymousClass143.A0H(r2)) {
                    quantityString = r11.A0J();
                    r1 = C52022ol.INTEROP_NAME;
                } else if (TextUtils.isEmpty(r11.A0J()) || ((r11.A0H instanceof C223313w) && r11.A0G == null)) {
                    if (r11.A0G()) {
                        A0D2 = this.A03.A0D((AnonymousClass11F) r11.A06(AnonymousClass11F.class));
                        if (TextUtils.isEmpty(A0D2)) {
                            if (C20800yB.A01(C21000yV.A02, this.A04, 3010)) {
                                AnonymousClass144 r9 = (AnonymousClass144) r11.A06(AnonymousClass144.class);
                                Objects.requireNonNull(r9);
                                A0D2 = AnonymousClass3SP.A00(this.A00, (AnonymousClass16D) this.A05.get(), this, this.A01, (AnonymousClass17X) this.A0C.get(), r9);
                            }
                        }
                        if (TextUtils.isEmpty(A0D2)) {
                            A0D2 = this.A01.A00.getString(R.string.f12nameremoved);
                        }
                    } else if (r11.A0H instanceof C177618e5) {
                        Jid A062 = r11.A06(C177538dx.class);
                        C18740tg.A06(A062);
                        int A002 = A00((C177538dx) A062);
                        quantityString = this.A01.A00.getResources().getQuantityString(R.plurals.f10nameremoved, A002, new Object[]{Integer.valueOf(A002)});
                        r1 = C52022ol.RECIPIENTS_COUNT;
                    } else {
                        str = null;
                        if (r2 == null) {
                            A0D2 = null;
                        } else {
                            A0D2 = this.A03.A0D(r2);
                        }
                        if (TextUtils.isEmpty(A0D2)) {
                            r0 = C52022ol.UNKNOWN;
                        }
                    }
                    r02 = C52022ol.CHAT_SUBJECT;
                } else {
                    quantityString = r11.A0J();
                    r1 = C52022ol.CONTACT_NAME;
                }
                return new AnonymousClass34G(r0, str);
            } else {
                quantityString = A0S(r11, false);
                r1 = C52022ol.VERIFIED_NAME;
            }
            return new AnonymousClass34G(r1, quantityString);
        }
        return new AnonymousClass34G(r02, A0D2);
    }

    public String A0I(AnonymousClass141 r4) {
        if (!(r4.A0H instanceof C177618e5) || !TextUtils.isEmpty(r4.A0J())) {
            return A0H(r4);
        }
        Jid A062 = r4.A06(C177538dx.class);
        C18740tg.A06(A062);
        return A04(this, (AnonymousClass144) A062, -1, true);
    }

    public String A0J(AnonymousClass141 r8) {
        AnonymousClass11F r3 = r8.A0H;
        C19730wQ r6 = this.A00;
        if (r6.A0M(r3)) {
            if (!C20800yB.A01(C21000yV.A02, this.A04, 1967)) {
                return this.A01.A00.getString(R.string.f12nameremoved);
            }
            r6.A0G();
            PhoneUserJid phoneUserJid = r6.A03;
            String A072 = AnonymousClass3U8.A07(phoneUserJid);
            if (!r6.A0L()) {
                AnonymousClass16D r1 = (AnonymousClass16D) this.A05.get();
                C19730wQ r0 = r1.A02;
                r0.A0G();
                AnonymousClass141 A0A2 = r1.A0A(r0.A03);
                if (A0A2 != null) {
                    String A0H = A0H(A0A2);
                    A0c(r3, phoneUserJid, A0H, "address book");
                    return A0H;
                }
            } else {
                String string = C19980wp.A00((C19980wp) this.A0B.get()).getString("self_contact_name", (String) null);
                if (string != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("companion=");
                    sb.append(r6.A0L());
                    sb.append("; deviceId=");
                    sb.append(r6.A04());
                    A0c(r3, phoneUserJid, string, sb.toString());
                    return string;
                }
            }
            A0c(r3, phoneUserJid, A072, "phone number");
            return this.A02.A0H(A072);
        } else if (r8.A0F != null) {
            return A0H(r8);
        } else {
            return this.A02.A0H(AnonymousClass3U8.A03(r8));
        }
    }

    public String A0K(AnonymousClass141 r3) {
        if (this.A00.A0M(r3.A0H)) {
            return this.A01.A00.getString(R.string.f12nameremoved);
        }
        if (r3.A0F != null) {
            return A0H(r3);
        }
        if (!TextUtils.isEmpty(r3.A0a)) {
            return A03(this, r3, R.string.f12nameremoved);
        }
        return null;
    }

    public String A0L(AnonymousClass141 r8) {
        if (r8.A0H instanceof C177528dw) {
            return this.A01.A00.getString(R.string.f12nameremoved);
        }
        if (r8.A0N()) {
            return A0S(r8, false);
        }
        if (!TextUtils.isEmpty(r8.A0J())) {
            return r8.A0J();
        }
        if (!TextUtils.isEmpty(r8.A0N)) {
            return r8.A0N;
        }
        if (r8.A0G()) {
            String A0D2 = this.A03.A0D((AnonymousClass11F) r8.A06(AnonymousClass11F.class));
            if (!TextUtils.isEmpty(A0D2)) {
                return A0D2;
            }
            if (!C20800yB.A01(C21000yV.A02, this.A04, 3010)) {
                return this.A01.A00.getString(R.string.f12nameremoved);
            }
            C19630wG r4 = this.A01;
            AnonymousClass144 r6 = (AnonymousClass144) r8.A06(AnonymousClass144.class);
            Objects.requireNonNull(r6);
            return AnonymousClass3SP.A00(this.A00, (AnonymousClass16D) this.A05.get(), this, r4, (AnonymousClass17X) this.A0C.get(), r6);
        } else if (r8.A0H instanceof C177618e5) {
            Jid A062 = r8.A06(C177538dx.class);
            C18740tg.A06(A062);
            int A002 = A00((C177538dx) A062);
            return this.A01.A00.getResources().getQuantityString(R.plurals.f10nameremoved, A002, new Object[]{Integer.valueOf(A002)});
        } else {
            String A0D3 = this.A03.A0D((AnonymousClass11F) r8.A06(AnonymousClass11F.class));
            if (!TextUtils.isEmpty(A0D3)) {
                return A0D3;
            }
            TextUtils.isEmpty(A03(this, r8, R.string.f12nameremoved));
            return A01(this, r8, true).A01;
        }
    }

    public String A0M(AnonymousClass141 r8) {
        String str;
        if (r8.A0H instanceof C177528dw) {
            return this.A01.A00.getString(R.string.f12nameremoved);
        }
        if (r8.A0N()) {
            return A0S(r8, false);
        }
        if (!TextUtils.isEmpty(r8.A0J())) {
            return r8.A0J();
        }
        if (r8.A0G()) {
            str = this.A03.A0D((AnonymousClass11F) r8.A06(AnonymousClass11F.class));
            if (TextUtils.isEmpty(str)) {
                if (!C20800yB.A01(C21000yV.A02, this.A04, 3010)) {
                    return this.A01.A00.getString(R.string.f12nameremoved);
                }
                C19630wG r4 = this.A01;
                AnonymousClass144 r6 = (AnonymousClass144) r8.A06(AnonymousClass144.class);
                Objects.requireNonNull(r6);
                return AnonymousClass3SP.A00(this.A00, (AnonymousClass16D) this.A05.get(), this, r4, (AnonymousClass17X) this.A0C.get(), r6);
            }
        } else if (r8.A0H instanceof C177618e5) {
            Jid A062 = r8.A06(C177538dx.class);
            C18740tg.A06(A062);
            int A002 = A00((C177538dx) A062);
            return this.A01.A00.getResources().getQuantityString(R.plurals.f10nameremoved, A002, new Object[]{Integer.valueOf(A002)});
        } else {
            str = this.A03.A0D((AnonymousClass11F) r8.A06(AnonymousClass11F.class));
            if (TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(r8.A0a)) {
                    return A03(this, r8, R.string.f12nameremoved);
                }
                return this.A02.A0H(AnonymousClass3U8.A03(r8));
            }
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (android.text.TextUtils.isEmpty(r4.A0J()) == false) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0S(X.AnonymousClass141 r4, boolean r5) {
        /*
            r3 = this;
            X.11F r0 = r4.A0H
            boolean r0 = r0 instanceof X.C177638e7
            if (r0 != 0) goto L_0x0026
            int r1 = r4.A08
            r0 = 3
            if (r1 == r0) goto L_0x0016
            boolean r0 = r3.A0e(r4)
            r2 = 2
            if (r0 == 0) goto L_0x002b
            int r0 = r4.A08
            if (r0 != r2) goto L_0x002b
        L_0x0016:
            if (r5 != 0) goto L_0x0026
            X.3IL r0 = r4.A0F
            if (r0 == 0) goto L_0x0026
            java.lang.String r0 = r4.A0J()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0042
        L_0x0026:
            java.lang.String r0 = r4.A0K()
            return r0
        L_0x002b:
            boolean r0 = r4.A0E()
            if (r0 != 0) goto L_0x0026
            int r1 = r4.A08
            if (r1 == r2) goto L_0x0047
            r0 = 1
            if (r1 == r0) goto L_0x0047
            boolean r0 = r4.A0G()
            if (r0 == 0) goto L_0x0056
            boolean r0 = r4.A0i
            if (r0 == 0) goto L_0x0056
        L_0x0042:
            java.lang.String r0 = r4.A0J()
            return r0
        L_0x0047:
            X.3IL r0 = r4.A0F
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = r4.A0J()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0056
            goto L_0x0042
        L_0x0056:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass171.A0S(X.141, boolean):java.lang.String");
    }

    public String A0T(AnonymousClass11F r3) {
        AnonymousClass141 A0D2 = ((AnonymousClass16D) this.A05.get()).A0D(r3);
        if (A0D2.A0B() || !A06(A0D2)) {
            return A0Q(A0D2, -1);
        }
        return A03(this, A0D2, R.string.f12nameremoved);
    }

    @Deprecated
    public String A0U(GroupJid groupJid) {
        if (groupJid == null) {
            return null;
        }
        return this.A03.A0D(groupJid);
    }

    public String A0Y(Iterable iterable, int i, int i2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        boolean z3 = false;
        if (i > 0) {
            z3 = true;
        }
        Iterator it = iterable.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            AnonymousClass141 r0 = (AnonymousClass141) it.next();
            i3++;
            if (!z3 || i3 <= i) {
                AnonymousClass34G A0D2 = A0D(r0, i2, z2);
                C52022ol r3 = A0D2.A00;
                String str = A0D2.A01;
                if (str != null) {
                    if (r3 == C52022ol.PHONE_NUMBER) {
                        arrayList3.add(str);
                    } else if (r3 == C52022ol.PUSH_NAME) {
                        arrayList2.add(str);
                    } else {
                        arrayList.add(str);
                    }
                }
            }
        }
        Collections.sort(arrayList, A0Z());
        Collections.sort(arrayList2, A0Z());
        Collections.sort(arrayList3);
        arrayList.addAll(arrayList2);
        arrayList.addAll(arrayList3);
        if (z) {
            i3++;
            arrayList.add(this.A01.A00.getString(R.string.f12nameremoved));
        }
        if (i3 <= i || i < 0) {
            return C55782vB.A00(this.A02, arrayList, z2);
        }
        int size = arrayList.size();
        Object[] objArr = new String[(size + 1)];
        for (int i4 = 0; i4 < size; i4++) {
            objArr[i4] = arrayList.get(i4);
        }
        int i5 = i3 - size;
        objArr[size] = this.A01.A00.getResources().getQuantityString(R.plurals.f10nameremoved, i5, new Object[]{Integer.valueOf(i5)});
        return C55782vB.A00(this.A02, Arrays.asList(objArr), z2);
    }

    public Collator A0Z() {
        Collator instance = Collator.getInstance(C18820ts.A01(this.A02.A00));
        instance.setDecomposition(1);
        return instance;
    }

    public ArrayList A0a(Context context, List list) {
        String A0H;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass11F r1 = (AnonymousClass11F) it.next();
            AnonymousClass141 A0D2 = ((AnonymousClass16D) this.A05.get()).A0D(r1);
            if (this.A00.A0M(r1)) {
                if (C20800yB.A01(C21000yV.A02, this.A04, 1967)) {
                    A0H = C53722rm.A00(context, this, this.A02, A0D2);
                    arrayList.add(A0H);
                }
            }
            if (!(A0D2.A0H instanceof C177528dw)) {
                A0H = A0H(A0D2);
                if (A0H == null) {
                }
                arrayList.add(A0H);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r2.equals(r1) != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        if (r8.equals(r1) != false) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0c(X.AnonymousClass11F r10, com.whatsapp.jid.PhoneUserJid r11, java.lang.String r12, java.lang.String r13) {
        /*
            r9 = this;
            if (r11 == 0) goto L_0x00a0
            if (r12 == 0) goto L_0x00a0
            X.005 r2 = r9.A0D     // Catch:{ 172 -> 0x00a0 }
            java.lang.Object r0 = r2.get()     // Catch:{ 172 -> 0x00a0 }
            X.9oI r0 = (X.C203559oI) r0     // Catch:{ 172 -> 0x00a0 }
            r8 = 0
            X.AUN r1 = r0.A0F(r12, r8)     // Catch:{ 172 -> 0x00a0 }
            java.lang.Object r0 = r2.get()     // Catch:{ 172 -> 0x00a0 }
            X.9oI r0 = (X.C203559oI) r0     // Catch:{ 172 -> 0x00a0 }
            boolean r0 = r0.A0M(r1)     // Catch:{ 172 -> 0x00a0 }
            if (r0 != 0) goto L_0x001e
            return
        L_0x001e:
            boolean r5 = r10 instanceof com.whatsapp.jid.PhoneUserJid
            java.lang.String r2 = X.AnonymousClass3U8.A06(r10)
            java.lang.String r3 = X.AnonymousClass3U8.A06(r11)
            java.lang.String r1 = X.AnonymousClass3U2.A03(r12)
            r0 = 4
            if (r2 == 0) goto L_0x009e
            java.lang.String r2 = X.AnonymousClass14B.A0B(r2, r0)
        L_0x0033:
            if (r3 == 0) goto L_0x0039
            java.lang.String r8 = X.AnonymousClass14B.A0B(r3, r0)
        L_0x0039:
            java.lang.String r1 = X.AnonymousClass14B.A0B(r1, r0)
            r7 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0048
            boolean r0 = r2.equals(r1)
            r6 = 1
            if (r0 == 0) goto L_0x0049
        L_0x0048:
            r6 = 0
        L_0x0049:
            if (r8 == 0) goto L_0x0052
            boolean r0 = r8.equals(r1)
            r3 = 1
            if (r0 == 0) goto L_0x0053
        L_0x0052:
            r3 = 0
        L_0x0053:
            if (r2 == 0) goto L_0x009c
            if (r8 == 0) goto L_0x009c
            boolean r0 = r2.equals(r8)
            if (r0 != 0) goto L_0x009c
        L_0x005d:
            if (r6 != 0) goto L_0x0063
            if (r3 != 0) goto L_0x0063
            if (r7 == 0) goto L_0x00a0
        L_0x0063:
            X.0wN r2 = r9.A09
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "contactVsDisplay="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "; jidVsDisplay="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; contactVsJid="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "; contactIsPhone="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "; context="
            r1.append(r0)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "contactnames/wrong display name"
            r2.A0E(r0, r1, r4)
            return
        L_0x009c:
            r7 = 0
            goto L_0x005d
        L_0x009e:
            r2 = r8
            goto L_0x0033
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass171.A0c(X.11F, com.whatsapp.jid.PhoneUserJid, java.lang.String, java.lang.String):void");
    }

    public void A0d(AnonymousClass144 r2) {
        this.A07.remove(r2);
        this.A08.remove(r2);
    }

    public boolean A0e(AnonymousClass141 r4) {
        C20810yC r2;
        int i;
        String str = r4.A0T;
        if (str != null && str.startsWith("smb:")) {
            r2 = this.A04;
            i = 2520;
        } else if (!r4.A0F()) {
            return false;
        } else {
            r2 = this.A04;
            i = 2519;
        }
        return !C20800yB.A01(C21000yV.A02, r2, i);
    }

    public boolean A0f(AnonymousClass141 r4) {
        if (r4.A0F != null) {
            String A0J = r4.A0J();
            String A0K = r4.A0K();
            if (TextUtils.isEmpty(A0K) || TextUtils.isEmpty(A0J) || !AnonymousClass14B.A05(A0J).equals(AnonymousClass14B.A05(A0K))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
        if (X.C20800yB.A01(r4, r5, 2630) == false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0h(X.AnonymousClass141 r20, java.util.List r21, boolean r22) {
        /*
            r19 = this;
            r18 = 1
            r1 = r21
            if (r21 == 0) goto L_0x0241
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0241
            r2 = r20
            java.lang.String r0 = r2.A0J()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r8 = r19
            if (r0 != 0) goto L_0x007f
            java.lang.String r0 = r2.A0J()
            java.lang.String r6 = X.AnonymousClass3TB.A03(r0)
        L_0x0022:
            java.lang.Class<X.11F> r0 = X.AnonymousClass11F.class
            com.whatsapp.jid.Jid r3 = r2.A06(r0)
            X.C18740tg.A06(r3)
            X.11F r3 = (X.AnonymousClass11F) r3
            java.lang.String r17 = X.AnonymousClass3U8.A06(r3)
            X.0wQ r7 = r8.A00
            boolean r0 = r7.A0M(r3)
            if (r0 == 0) goto L_0x004e
            X.0yC r5 = r8.A04
            r0 = 1967(0x7af, float:2.756E-42)
            X.0yV r4 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r4, r5, r0)
            if (r0 == 0) goto L_0x004e
            r0 = 2630(0xa46, float:3.685E-42)
            boolean r4 = X.C20800yB.A01(r4, r5, r0)
            r0 = 1
            if (r4 != 0) goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            r16 = 0
            if (r0 == 0) goto L_0x01bf
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            X.0wG r0 = r8.A01
            android.content.Context r5 = r0.A00
            android.content.res.Resources r4 = r5.getResources()
            r0 = 2130903064(0x7f030018, float:1.7412935E38)
            java.lang.String[] r11 = r4.getStringArray(r0)
            int r10 = r11.length
            r9 = 0
        L_0x0069:
            if (r9 >= r10) goto L_0x0128
            r4 = r11[r9]
            X.0ts r0 = r8.A02
            android.content.Context r0 = r0.A00
            java.util.Locale r0 = X.C18820ts.A01(r0)
            java.lang.String r0 = r4.toLowerCase(r0)
            r12.add(r0)
            int r9 = r9 + 1
            goto L_0x0069
        L_0x007f:
            X.11F r0 = r2.A0H
            boolean r0 = r0 instanceof X.C177618e5
            if (r0 == 0) goto L_0x0097
            java.lang.Class<X.8dx> r0 = X.C177538dx.class
            com.whatsapp.jid.Jid r4 = r2.A06(r0)
            X.C18740tg.A06(r4)
            X.144 r4 = (X.AnonymousClass144) r4
            r3 = -1
            r0 = 0
            java.lang.String r6 = A04(r8, r4, r3, r0)
            goto L_0x0022
        L_0x0097:
            boolean r0 = r2.A0G()
            if (r0 == 0) goto L_0x010c
            X.0yC r4 = r8.A04
            r0 = 3010(0xbc2, float:4.218E-42)
            X.0yV r3 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r3, r4, r0)
            if (r0 == 0) goto L_0x010c
            r0 = 6645(0x19f5, float:9.312E-42)
            boolean r0 = X.C20800yB.A01(r3, r4, r0)
            if (r0 == 0) goto L_0x00f1
            X.12q r3 = r8.A03
            java.lang.Class<X.144> r7 = X.AnonymousClass144.class
            com.whatsapp.jid.Jid r0 = r2.A06(r7)
            X.C18740tg.A06(r0)
            X.11F r0 = (X.AnonymousClass11F) r0
            java.lang.String r6 = r3.A0D(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x0022
            X.0wG r6 = r8.A01
            X.0wQ r5 = r8.A00
            X.005 r0 = r8.A05
            java.lang.Object r4 = r0.get()
            X.16D r4 = (X.AnonymousClass16D) r4
            X.005 r0 = r8.A0C
            java.lang.Object r3 = r0.get()
            X.17X r3 = (X.AnonymousClass17X) r3
            com.whatsapp.jid.Jid r0 = r2.A06(r7)
        L_0x00e0:
            X.C18740tg.A06(r0)
            X.144 r0 = (X.AnonymousClass144) r0
            r9 = r5
            r10 = r4
            r11 = r8
            r12 = r6
            r13 = r3
            r14 = r0
            java.lang.String r6 = X.AnonymousClass3SP.A00(r9, r10, r11, r12, r13, r14)
            goto L_0x0022
        L_0x00f1:
            X.0wG r6 = r8.A01
            X.0wQ r5 = r8.A00
            X.005 r0 = r8.A05
            java.lang.Object r4 = r0.get()
            X.16D r4 = (X.AnonymousClass16D) r4
            X.005 r0 = r8.A0C
            java.lang.Object r3 = r0.get()
            X.17X r3 = (X.AnonymousClass17X) r3
            java.lang.Class<X.144> r0 = X.AnonymousClass144.class
            com.whatsapp.jid.Jid r0 = r2.A06(r0)
            goto L_0x00e0
        L_0x010c:
            X.11F r0 = r2.A0H
            boolean r0 = r0 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x0122
            java.lang.String r0 = r8.A0H(r2)
            boolean r0 = X.AnonymousClass14B.A0F(r0)
            if (r0 != 0) goto L_0x0122
            java.lang.String r6 = r8.A0H(r2)
            goto L_0x0022
        L_0x0122:
            java.lang.String r6 = X.AnonymousClass3U8.A03(r2)
            goto L_0x0022
        L_0x0128:
            java.util.Iterator r10 = r12.iterator()
        L_0x012c:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x014f
            java.lang.Object r9 = r10.next()
            java.lang.String r9 = (java.lang.String) r9
            java.util.Iterator r4 = r1.iterator()
        L_0x013c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x012c
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r9.contains(r0)
            if (r0 == 0) goto L_0x013c
            return r18
        L_0x014f:
            java.util.Iterator r15 = r1.iterator()
        L_0x0153:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x01bf
            java.lang.Object r9 = r15.next()
            java.lang.String r9 = (java.lang.String) r9
            r7.A0G()
            X.142 r4 = r7.A0E
            if (r4 == 0) goto L_0x0153
            X.0ts r0 = r8.A02
            java.lang.String r0 = X.C53722rm.A00(r5, r8, r0, r4)
            java.lang.String r14 = r4.A0R
            java.lang.String r13 = r4.A0Q
            java.lang.String r12 = r4.A0a
            java.lang.String r11 = r4.A0W
            java.lang.String r10 = r4.A0U
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r4)
            boolean r0 = r0.contains(r9)
            if (r0 != 0) goto L_0x0241
            if (r14 == 0) goto L_0x018e
            java.lang.String r0 = r14.toLowerCase(r4)
            boolean r0 = r0.contains(r9)
            if (r0 != 0) goto L_0x0241
        L_0x018e:
            if (r13 == 0) goto L_0x019a
            java.lang.String r0 = r13.toLowerCase(r4)
            boolean r0 = r0.contains(r9)
            if (r0 != 0) goto L_0x0241
        L_0x019a:
            if (r12 == 0) goto L_0x01a6
            java.lang.String r0 = r12.toLowerCase(r4)
            boolean r0 = r0.contains(r9)
            if (r0 != 0) goto L_0x0241
        L_0x01a6:
            if (r11 == 0) goto L_0x01b2
            java.lang.String r0 = r11.toLowerCase(r4)
            boolean r0 = r0.contains(r9)
            if (r0 != 0) goto L_0x0241
        L_0x01b2:
            if (r10 == 0) goto L_0x0153
            java.lang.String r0 = r10.toLowerCase(r4)
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L_0x0153
            return r18
        L_0x01bf:
            X.0ts r5 = r8.A02
            r4 = r22
            boolean r0 = X.C202859mm.A04(r5, r6, r1, r4)
            if (r0 != 0) goto L_0x0241
            boolean r0 = r2.A0C()
            if (r0 == 0) goto L_0x01e5
            boolean r0 = r2.A0A()
            if (r0 != 0) goto L_0x01db
            boolean r0 = r2.A0E()
            if (r0 == 0) goto L_0x01e5
        L_0x01db:
            java.lang.String r0 = r2.A0K()
            boolean r0 = X.C202859mm.A04(r5, r0, r1, r4)
            if (r0 != 0) goto L_0x0241
        L_0x01e5:
            X.11F r0 = r2.A0H
            boolean r0 = X.AnonymousClass143.A0I(r0)
            if (r0 == 0) goto L_0x01f7
            java.lang.String r0 = r2.A0J()
            boolean r0 = X.C202859mm.A04(r5, r0, r1, r4)
            if (r0 != 0) goto L_0x0241
        L_0x01f7:
            java.lang.String r0 = r2.A0U
            boolean r0 = X.C202859mm.A04(r5, r0, r1, r4)
            if (r0 != 0) goto L_0x0241
            java.lang.String r0 = r2.A0O
            boolean r0 = X.C202859mm.A04(r5, r0, r1, r4)
            if (r0 != 0) goto L_0x0241
            java.lang.String r0 = r2.A0Z
            boolean r0 = X.C202859mm.A04(r5, r0, r1, r4)
            if (r0 != 0) goto L_0x0241
            X.11F r0 = r2.A0H
            boolean r0 = r0 instanceof X.C177618e5
            if (r0 != 0) goto L_0x023b
            boolean r0 = r2.A0G()
            if (r0 != 0) goto L_0x023b
            boolean r0 = android.text.TextUtils.isEmpty(r17)
            if (r0 != 0) goto L_0x023b
            java.util.Iterator r2 = r1.iterator()
        L_0x0225:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0241
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = r3.user
            if (r22 == 0) goto L_0x023c
            boolean r0 = r0.contains(r1)
        L_0x0239:
            if (r0 != 0) goto L_0x0225
        L_0x023b:
            return r16
        L_0x023c:
            boolean r0 = r0.equals(r1)
            goto L_0x0239
        L_0x0241:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass171.A0h(X.141, java.util.List, boolean):boolean");
    }

    public AnonymousClass171(C19700wN r2, C19730wQ r3, C19630wG r4, C18820ts r5, C220412q r6, C20810yC r7, C20500xf r8, AnonymousClass005 r9, AnonymousClass005 r10, AnonymousClass005 r11, AnonymousClass005 r12, AnonymousClass005 r13) {
        this.A01 = r4;
        this.A04 = r7;
        this.A09 = r2;
        this.A00 = r3;
        this.A03 = r6;
        this.A0A = r8;
        this.A05 = r9;
        this.A02 = r5;
        this.A0D = r10;
        this.A06 = r11;
        this.A0C = r12;
        this.A0B = r13;
    }

    public static String A03(AnonymousClass171 r2, AnonymousClass141 r3, int i) {
        String A0O = r2.A0O(r3);
        if (A0O == null) {
            return "";
        }
        return r2.A01.A00.getString(i, new Object[]{A0O});
    }

    public static boolean A05(AnonymousClass171 r4, Iterable iterable, Set set) {
        Iterator it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            AnonymousClass11F r1 = (AnonymousClass11F) it.next();
            if (r4.A00.A0M(r1)) {
                z = true;
            } else {
                set.add(((AnonymousClass16D) r4.A05.get()).A0D(r1));
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r4.A0G == null) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A08(X.AnonymousClass141 r4, X.AnonymousClass11F r5) {
        /*
            r3 = this;
            boolean r0 = X.AnonymousClass143.A0G(r5)
            if (r0 != 0) goto L_0x0008
            r0 = 2
            return r0
        L_0x0008:
            if (r4 == 0) goto L_0x000f
            X.141 r1 = r4.A0G
            r0 = 1
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            if (r5 == 0) goto L_0x0051
            if (r0 != 0) goto L_0x0051
            X.005 r0 = r3.A06
            java.lang.Object r1 = r0.get()
            X.1dw r1 = (X.C32631dw) r1
            boolean r0 = r5 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x0051
            X.12q r0 = r1.A00
            boolean r0 = r0.A0O(r5)
            if (r0 != 0) goto L_0x0048
            X.17X r0 = r1.A01
            X.144 r5 = (X.AnonymousClass144) r5
            X.17r r0 = r0.A07
            X.6X6 r2 = r0.A0C(r5)
            int r1 = r2.A00
            r0 = 3
            if (r0 != r1) goto L_0x004a
            java.util.Map r0 = r2.A07
            java.util.Collection r0 = r0.values()
            X.0y7 r0 = X.C20760y7.copyOf((java.util.Collection) r0)
            int r1 = r0.size()
        L_0x0045:
            r0 = 3
            if (r1 < r0) goto L_0x0051
        L_0x0048:
            r0 = 7
            return r0
        L_0x004a:
            java.util.Map r0 = r2.A08
            int r1 = r0.size()
            goto L_0x0045
        L_0x0051:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass171.A08(X.141, X.11F):int");
    }

    public int A0A(AnonymousClass11F r2) {
        if (!AnonymousClass143.A0G(r2) || !(r2 instanceof GroupJid)) {
            return 2;
        }
        return A09(r2);
    }

    public AnonymousClass34G A0E(AnonymousClass141 r4, int i, boolean z, boolean z2) {
        C52022ol r0;
        AnonymousClass34G A0F = A0F(r4, z);
        if (!TextUtils.isEmpty(A0F.A01)) {
            return A0F;
        }
        String A032 = A03(this, r4, R.string.f12nameremoved);
        if (!TextUtils.isEmpty(A032) && i == 7) {
            r0 = C52022ol.PUSH_NAME;
        } else if (i != 8) {
            return A01(this, r4, z2);
        } else {
            A032 = A0K(r4);
            r0 = C52022ol.MY_GROUP_NAME;
        }
        return new AnonymousClass34G(r0, A032);
    }

    public String A0G(C52022ol r2, AnonymousClass141 r3, int i) {
        return A0B(r2, r3, i).A01;
    }

    public String A0N(AnonymousClass141 r2) {
        return A03(this, r2, R.string.f12nameremoved);
    }

    public String A0O(AnonymousClass141 r3) {
        if (!r3.A0C() && !TextUtils.isEmpty(r3.A0a)) {
            return r3.A0a;
        }
        if ((!r3.A0C() || r3.A0A() || TextUtils.isEmpty(r3.A0K())) && !AnonymousClass3M3.A01(this.A0A, r3.A0H)) {
            return null;
        }
        return r3.A0K();
    }

    public String A0P(AnonymousClass141 r7, int i) {
        AnonymousClass34G A0C2 = A0C(r7, i);
        String str = A0C2.A01;
        C52022ol r1 = A0C2.A00;
        String A0G = A0G(r1, r7, i);
        if (C52022ol.PUSH_NAME == r1 && i == 7) {
            str = A03(this, r7, R.string.f12nameremoved);
        }
        if (!TextUtils.isEmpty(A0G)) {
            str = this.A01.A00.getString(R.string.f12nameremoved, new Object[]{str, A0G});
        }
        if (str != null) {
            return str.trim();
        }
        return "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        if (r5 == false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        if (r1 != 1) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0040, code lost:
        if (r7.A0A() == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0043, code lost:
        r1 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0g(X.AnonymousClass141 r7, int r8) {
        /*
            r6 = this;
            boolean r5 = A06(r7)
            r1 = 1
            if (r8 == r1) goto L_0x000e
            r0 = 5
            if (r8 == r0) goto L_0x000e
            r0 = 7
            if (r8 == r0) goto L_0x000e
            r1 = 0
        L_0x000e:
            r4 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0015
            r2 = 1
            if (r5 != 0) goto L_0x003c
        L_0x0015:
            r2 = 0
            if (r5 != 0) goto L_0x003c
            int r1 = r7.A08
            r0 = 2
            if (r1 == r0) goto L_0x001f
            if (r1 != r3) goto L_0x0043
        L_0x001f:
            r1 = 1
        L_0x0020:
            X.11F r0 = r7.A0H
            boolean r0 = r0 instanceof X.C177618e5
            if (r0 != 0) goto L_0x003b
            java.lang.String r0 = r7.A0J()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x003b
            if (r2 != 0) goto L_0x003b
            java.lang.String r0 = r7.A0K()
            if (r0 == 0) goto L_0x003a
            if (r1 == 0) goto L_0x003b
        L_0x003a:
            r4 = 1
        L_0x003b:
            return r4
        L_0x003c:
            boolean r0 = r7.A0A()
            if (r0 != 0) goto L_0x0043
            goto L_0x001f
        L_0x0043:
            r1 = 0
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass171.A0g(X.141, int):boolean");
    }
}
