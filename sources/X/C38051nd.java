package X;

import android.content.Context;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1nd  reason: invalid class name and case insensitive filesystem */
public class C38051nd extends CursorAdapter {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05 = Long.MIN_VALUE;
    public AnonymousClass0V9 A06;
    public C23931Ak A07 = C23931Ak.of();
    public AnonymousClass174 A08;
    public C605338f A09;
    public C64933Qa A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D = false;
    public boolean A0E;
    public int A0F = 0;
    public AnonymousClass3T1 A0G;
    public final SparseArray A0H = new SparseArray();
    public final AnonymousClass3CN A0I;
    public final C19420v0 A0J;
    public final AnonymousClass11F A0K;
    public final AnonymousClass1A1 A0L;
    public final HashSet A0M = C36441kJ.A16();
    public final HashSet A0N = C36441kJ.A16();
    public final HashSet A0O = C36441kJ.A16();
    public final HashSet A0P = C36441kJ.A16();
    public final List A0Q = AnonymousClass001.A0I();
    public final Set A0R = C36441kJ.A16();
    public final AnonymousClass01L A0S;
    public final C19730wQ A0T;
    public final AnonymousClass3QY A0U;
    public final C89004Uw A0V;
    public final AnonymousClass3S3 A0W;
    public final C19970wo A0X;
    public final C20810yC A0Y;
    public final AnonymousClass19I A0Z;
    public final C237919w A0a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38051nd(AnonymousClass01L r4, C19730wQ r5, AnonymousClass3CN r6, AnonymousClass3QY r7, C89004Uw r8, AnonymousClass3S3 r9, C19970wo r10, C19420v0 r11, C20810yC r12, AnonymousClass11F r13, AnonymousClass19I r14, AnonymousClass3G3 r15, C237919w r16, AnonymousClass1A1 r17) {
        super(r4, (Cursor) null, false);
        boolean z = false;
        this.A0X = r10;
        this.A0K = r13;
        this.A0T = r5;
        this.A0a = r16;
        this.A0L = r17;
        this.A0Z = r14;
        this.A0W = r9;
        this.A0V = r8;
        this.A0S = r4;
        this.A0U = r7;
        this.A0I = r6;
        this.A0Y = r12;
        this.A0J = r11;
        if ((r13 instanceof C28981Uw) && r15.A01((C28981Uw) r13)) {
            z = true;
        }
        this.A0E = z;
    }

    public void changeCursor(Cursor cursor) {
        this.A0C = true;
        if (cursor != null) {
            this.A0F = cursor.getCount();
        }
        super.changeCursor(cursor);
    }

    public boolean hasStableIds() {
        return true;
    }

    public static void A00(C70803fk r2) {
        r2.A2U.getConversationCursorAdapter().A01++;
        r2.A2U.A05();
    }

    private boolean A01(AnonymousClass2IR r5, AnonymousClass3T1 r6) {
        C89014Ux conversationRowCustomizer = this.A0V.getConversationRowCustomizer();
        int B3N = conversationRowCustomizer.B3N();
        if (r5.A01 == B3N || !conversationRowCustomizer.BtI()) {
            HashSet hashSet = this.A0P;
            C64933Qa r1 = r6.A1J;
            if (hashSet.contains(r1) || this.A0M.contains(r1) || this.A0O.contains(r1) || this.A0N.contains(r1) || this.A06 != null || r5.A04 != this.A01 || (r6 instanceof C46902br)) {
                return true;
            }
            return false;
        }
        r5.A01 = B3N;
        return true;
    }

    private boolean A02(AnonymousClass3T1 r7) {
        int i;
        C88944Uq r0;
        C51762oL A002 = this.A0I.A00(r7);
        if (A002 != C51762oL.NONE && ((A002 == C51762oL.AGENT_LINKS || r7.A1O <= this.A05) && r7.A1N > 0 && (((i = r7.A1I) != 20 || r7.A0S() == null) && !C202359le.A04(r7) && r7.A0V == null))) {
            if (i != 20) {
                return true;
            }
            C19970wo r4 = this.A0X;
            C19730wQ r3 = this.A0T;
            AnonymousClass19I r2 = this.A0Z;
            C20810yC r1 = this.A0Y;
            if (C66013Ui.A08(r3, r4, r1, r2, r7) != null || ((r0 = r7.A0J) != null && C66013Ui.A09(r3, r4, r1, r2, r0.B8Y()) != null)) {
                return false;
            }
            if ((!(r7 instanceof AnonymousClass2bS) || C66013Ui.A09(r3, r4, r1, r2, ((AnonymousClass2bS) r7).A04) == null) && C66013Ui.A09(r3, r4, r1, r2, Collections.singletonList(r7.A1U)) == null && C66013Ui.A09(r3, r4, r1, r2, Collections.singletonList(r7.A1V)) == null) {
                if (!(r7 instanceof AnonymousClass2c9) || C66013Ui.A09(r3, r4, r1, r2, Collections.singletonList(((AnonymousClass2c9) r7).A00)) == null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    private boolean A03(AnonymousClass3T1 r11, AnonymousClass3T1 r12, int i, int i2) {
        boolean z;
        AnonymousClass3T1 A0S2;
        AnonymousClass3T1 A0S3;
        AnonymousClass11F A0J2;
        long j = r11.A0I;
        long j2 = r12.A0I;
        if (Math.abs(j - j2) <= 610000 && AnonymousClass6XI.A04(j, j2) && AnonymousClass000.A1S(r11.A0A & 1, 1) == AnonymousClass000.A1S(r12.A0A & 1, 1) && (z = r11.A1J.A02) == r12.A1J.A02 && ((z || (A0J2 = r11.A0J()) == null || A0J2.equals(r12.A0J())) && AnonymousClass000.A1T(i, A04()) == AnonymousClass000.A1T(i2, A04()))) {
            AnonymousClass3CN r0 = this.A0I;
            if (r0.A00(r11) == r0.A00(r12) && ((A0S2 = r11.A0S()) == (A0S3 = r12.A0S()) || !(A0S2 == null || A0S3 == null || !AnonymousClass3T1.A0B(A0S2, A0S3)))) {
                C63393Jw A0W2 = r11.A0W();
                C63393Jw A0W3 = r12.A0W();
                if (A0W2 == null) {
                    if (A0W3 == null) {
                        return true;
                    }
                    return false;
                } else if (A0W3 == null || !A0W2.A01.equals(A0W3.A01)) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public int A04() {
        if (this.A0E) {
            return 0;
        }
        return (this.A0F + this.A07.size()) - this.A04;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r1 != 2) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A05(X.C51752oK r7, int r8) {
        /*
            r6 = this;
            X.2oK r0 = X.C51752oK.NONE
            if (r7 == r0) goto L_0x0022
            X.2oK r0 = X.C51752oK.TOP
            if (r7 == r0) goto L_0x0022
            X.3T1 r5 = r6.getItem(r8)
            X.C18740tg.A06(r5)
            X.3CN r0 = r6.A0I
            X.2oL r0 = r0.A00(r5)
            int r1 = r0.ordinal()
            r4 = 1
            if (r1 == r4) goto L_0x0023
            r0 = 3
            if (r1 == r0) goto L_0x0040
            r0 = 2
            if (r1 == r0) goto L_0x0056
        L_0x0022:
            return r8
        L_0x0023:
            int r3 = r8 + -1
            r2 = r5
        L_0x0026:
            if (r3 < 0) goto L_0x0040
            X.3T1 r1 = r6.getItem(r3)
            if (r1 == 0) goto L_0x005c
            int r0 = r3 + 1
            boolean r0 = r6.A03(r1, r2, r3, r0)
            if (r0 == 0) goto L_0x005c
            boolean r0 = r6.A02(r1)
            if (r0 == 0) goto L_0x005c
            int r3 = r3 + -1
            r2 = r1
            goto L_0x0026
        L_0x0040:
            int r3 = r8 + -1
        L_0x0042:
            if (r3 < 0) goto L_0x0056
            X.3T1 r1 = r6.getItem(r3)
            if (r1 == 0) goto L_0x005c
            X.3S3 r0 = r6.A0W
            boolean r0 = r0.A02(r1, r5)
            if (r0 == 0) goto L_0x005c
            int r3 = r3 + -1
            r5 = r1
            goto L_0x0042
        L_0x0056:
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x0022
            int r8 = r8 - r4
            return r8
        L_0x005c:
            int r0 = r3 + 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38051nd.A05(X.2oK, int):int");
    }

    /* renamed from: A08 */
    public AnonymousClass3T1 getItem(int i) {
        C202319lY r4;
        AnonymousClass3T1 r2 = null;
        if (!this.A0E) {
            if (this.A04 <= 0 || i != A04()) {
                Cursor cursor = getCursor();
                if (cursor != null) {
                    int A042 = A04();
                    int i2 = i;
                    if (i > A042) {
                        i2 = i - 1;
                    }
                    int i3 = this.A0F;
                    if (i2 < i3) {
                        SparseArray sparseArray = this.A0H;
                        r2 = (AnonymousClass3T1) sparseArray.get(i2);
                        if (r2 == null) {
                            int position = cursor.getPosition();
                            cursor.moveToPosition((this.A0F - 1) - i2);
                            int position2 = cursor.getPosition();
                            try {
                                r2 = this.A0L.A01(cursor, this.A0K);
                                if (position2 < position) {
                                    int i4 = this.A00;
                                    if (position2 <= i4 || position2 > i4 + 50) {
                                        int max = Math.max(0, position2 - 50);
                                        this.A00 = max;
                                        cursor.moveToPosition(max);
                                    }
                                }
                                sparseArray.put(i2, r2);
                            } catch (CursorIndexOutOfBoundsException e) {
                                StringBuilder A0u = AnonymousClass000.A0u();
                                A0u.append("ConversationCursorAdapter/getItem out-of-bounds");
                                StringBuilder A0u2 = AnonymousClass000.A0u();
                                A0u2.append(" unseenRowCount:");
                                A0u2.append(this.A04);
                                A0u2.append(" unseenMsgCount:");
                                A0u2.append(this.A02);
                                A0u2.append(" unseenCallCount:");
                                A0u2.append(this.A03);
                                A0u2.append(" cachePos:");
                                A0u2.append(this.A00);
                                A0u2.append(" appended:");
                                A0u2.append(this.A07.size());
                                A0u2.append(" db:");
                                A0u2.append(sparseArray.size());
                                A0u2.append(" jidString:");
                                AnonymousClass11F r1 = this.A0K;
                                A0u2.append(r1);
                                A0u2.append(" jidType:");
                                A0u2.append(r1.getType());
                                C36351kA.A1K(A0u2, A0u);
                                A0u.append(" cursorCount:");
                                A0u.append(this.A0F);
                                A0u.append(" dataPos:");
                                A0u.append(i2);
                                A0u.append(" viewPos:");
                                A0u.append(i);
                                A0u.append(" dividerPos:");
                                A0u.append(A042);
                                A0u.append(" oldPos:");
                                A0u.append(position);
                                C36321k7.A1S(" newPos:", A0u, position2);
                                throw e;
                            }
                        }
                    } else {
                        int i5 = i2 - i3;
                        if (i5 >= 0 && i5 < this.A07.size()) {
                            r2 = C36411kG.A0n(this.A07, i2 - this.A0F);
                        }
                    }
                    for (C202179lC r3 : this.A0Q) {
                        if (!(r2 == null || (r4 = r2.A0M) == null || r4.A03 != 1000)) {
                            C19730wQ r12 = r3.A04;
                            if (r12.A0M(r4.A0D) || r12.A0M(r2.A0M.A0E)) {
                                r3.A04((C22972AzO) null, r2.A0M.A0K);
                            } else {
                                C202179lC.A02(r3, r2.A1J, r2.A0M.A0K);
                            }
                        }
                    }
                }
            } else {
                if (this.A0G == null) {
                    AnonymousClass2bV r13 = new AnonymousClass2bV(C36411kG.A0o((AnonymousClass11F) null, this.A0a), C19970wo.A00(this.A0X));
                    this.A0G = r13;
                    r13.A16("dummy msg!");
                }
                return this.A0G;
            }
        }
        return r2;
    }

    public void A09(AnonymousClass3CQ r7) {
        int intValue;
        AnonymousClass3CQ r5 = this.A0U.A05;
        ConcurrentHashMap concurrentHashMap = r7.A00;
        Enumeration keys = concurrentHashMap.keys();
        AnonymousClass00C.A08(keys);
        C12280hn r3 = new C12280hn(keys);
        while (r3.hasNext()) {
            Object next = r3.next();
            AnonymousClass00C.A0D(next, 0);
            Number A10 = C36441kJ.A10(next, concurrentHashMap);
            if (A10 == null) {
                intValue = 0;
            } else {
                intValue = A10.intValue();
            }
            r5.A00.put(next, Integer.valueOf(intValue));
        }
    }

    public void bindView(View view, Context context, Cursor cursor) {
        throw AnonymousClass001.A09("should not be called, getView is defined");
    }

    public int getCount() {
        int i = 0;
        if (!this.A0C || getCursor() == null || this.A0E) {
            return 0;
        }
        int size = this.A0F + this.A07.size();
        if (this.A04 > 0) {
            i = 1;
        }
        return size + i;
    }

    public int getItemViewType(int i) {
        if (!this.A0C) {
            return -1;
        }
        if (this.A04 > 0 && i == A04()) {
            return 18;
        }
        AnonymousClass3T1 A082 = getItem(i);
        if (A082 == null) {
            return -1;
        }
        AnonymousClass3QY r2 = this.A0U;
        C51752oK A072 = A07(A082, i);
        if (A072 == C51752oK.NONE) {
            return r2.A01(A082);
        }
        if (A072 != C51752oK.TOP) {
            return 34;
        }
        int ordinal = r2.A04.A00(A082).ordinal();
        if (ordinal != 2) {
            if (ordinal == 3) {
                return 107;
            }
            if (A082.A1J.A02) {
                return 32;
            }
            return 33;
        } else if (A082.A1J.A02) {
            return 41;
        } else {
            return 42;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0239, code lost:
        if (r1.containsKey(r0) != false) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0251, code lost:
        if (r5.getClass().equals(r4.getFMessage().getClass()) != false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0384, code lost:
        if (r0.A00 != 1) goto L_0x0386;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x04b8, code lost:
        if (r6 != false) goto L_0x04ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0104, code lost:
        r1 = (X.AnonymousClass2IE) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r1 != false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01bf, code lost:
        if (r1.A03.A0F == null) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01d5, code lost:
        if (r4.A1C.A01(X.C64933Qa.A01(r4.A0K)).A0F != null) goto L_0x01d7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x03f4  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0483  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r15, android.view.View r16, android.view.ViewGroup r17) {
        /*
            r14 = this;
            r3 = r16
            boolean r0 = r14.A0D
            if (r0 != 0) goto L_0x0016
            X.174 r0 = r14.A08
            if (r0 == 0) goto L_0x0016
            X.38f r0 = r14.A09
            if (r0 == 0) goto L_0x0016
            X.C18740tg.A01()
            boolean r1 = r0.A01
            r0 = 1
            if (r1 == 0) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            java.lang.String r7 = "adapter_row"
            if (r0 == 0) goto L_0x0025
            X.174 r0 = r14.A08
            X.C18740tg.A06(r0)
            X.0zf r0 = r0.A01
            r0.A07(r7)
        L_0x0025:
            int r0 = r14.A04()
            r8 = 2
            r6 = 0
            r5 = 1
            r2 = r17
            if (r15 != r0) goto L_0x009b
            if (r16 != 0) goto L_0x003d
            android.view.LayoutInflater r1 = X.C36351kA.A0C(r2)
            r0 = 2131624727(0x7f0e0317, float:1.8876642E38)
            android.view.View r3 = r1.inflate(r0, r2, r6)
        L_0x003d:
            r0 = 2131434937(0x7f0b1db9, float:1.8491702E38)
            android.widget.TextView r9 = X.C36391kE.A0O(r3, r0)
            X.11F r0 = r14.A0K
            boolean r4 = r0 instanceof X.C28981Uw
            int r1 = r14.A02
            int r0 = r14.A03
            if (r1 <= 0) goto L_0x0088
            android.content.res.Resources r2 = r3.getResources()
            r1 = 2131755392(0x7f100180, float:1.9141662E38)
            if (r0 <= 0) goto L_0x0080
            int r0 = r14.A02
            java.lang.String r7 = X.C36321k7.A0B(r2, r0, r6, r1)
            android.content.res.Resources r2 = r3.getResources()
            r1 = 2131755199(0x7f1000bf, float:1.914127E38)
            int r0 = r14.A03
            java.lang.String r4 = X.C36321k7.A0B(r2, r0, r6, r1)
            android.content.Context r2 = r3.getContext()
            r1 = 2131895233(0x7f1223c1, float:1.9425293E38)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r6] = r7
            java.lang.String r0 = X.C36391kE.A0v(r2, r4, r0, r5, r1)
        L_0x0079:
            r9.setText(r0)
            r9.setFocusable(r5)
            return r3
        L_0x0080:
            if (r4 == 0) goto L_0x0085
            r1 = 2131755396(0x7f100184, float:1.914167E38)
        L_0x0085:
            int r0 = r14.A02
            goto L_0x0093
        L_0x0088:
            if (r0 <= 0) goto L_0x0098
            android.content.res.Resources r2 = r3.getResources()
            r1 = 2131755199(0x7f1000bf, float:1.914127E38)
            int r0 = r14.A03
        L_0x0093:
            java.lang.String r0 = X.C36321k7.A0B(r2, r0, r6, r1)
            goto L_0x0079
        L_0x0098:
            java.lang.String r0 = ""
            goto L_0x0079
        L_0x009b:
            X.3T1 r5 = r14.getItem(r15)
            if (r5 != 0) goto L_0x00b8
            java.lang.String r0 = "Conversation/isMessageValid message was null, already deleted?"
        L_0x00a3:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.content.Context r0 = r2.getContext()
            android.view.View r3 = new android.view.View
            r3.<init>(r0)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r6, r6)
            r3.setLayoutParams(r0)
            return r3
        L_0x00b8:
            int r1 = r5.A1I
            r0 = 36
            if (r1 != r0) goto L_0x00cb
            X.3Qa r0 = r5.A1J
            X.11F r0 = r0.A00
            boolean r0 = X.AnonymousClass143.A0G(r0)
            if (r0 == 0) goto L_0x00cb
            java.lang.String r0 = "Conversation/isMessageValid message was malicious."
            goto L_0x00a3
        L_0x00cb:
            boolean r0 = r5 instanceof X.C181248nA
            if (r0 == 0) goto L_0x00da
            r4 = r5
            X.8nA r4 = (X.C181248nA) r4
            com.whatsapp.jid.UserJid r0 = r4.A01
            if (r0 == 0) goto L_0x0255
            com.whatsapp.jid.UserJid r0 = r4.A00
            if (r0 == 0) goto L_0x0255
        L_0x00da:
            X.C18740tg.A06(r5)
            X.2oK r8 = r14.A07(r5, r15)
            boolean r0 = r3 instanceof X.AnonymousClass2IR
            if (r0 == 0) goto L_0x0100
            X.0yC r9 = r14.A0Y
            r4 = r3
            X.2IR r4 = (X.AnonymousClass2IR) r4
            X.3T1 r0 = r4.getFMessage()
            int r0 = r0.A1I
            if (r0 != r1) goto L_0x0100
            boolean r0 = r5 instanceof X.AnonymousClass2bK
            if (r0 == 0) goto L_0x019e
            boolean r1 = X.C37541mm.A06(r4)
            X.3Qa r0 = r5.A1J
            boolean r0 = r0.A02
            if (r1 == r0) goto L_0x019e
        L_0x0100:
            boolean r0 = r3 instanceof X.AnonymousClass2IE
            if (r0 == 0) goto L_0x0113
            r1 = r3
            X.2IE r1 = (X.AnonymousClass2IE) r1
            com.whatsapp.conversation.carousel.ConversationCarousel r0 = r1.A01
            if (r0 == 0) goto L_0x0113
            r1.removeView(r0)
            r0 = 0
            r1.A01 = r0
            r1.A03 = r0
        L_0x0113:
            X.3QY r4 = r14.A0U
            android.content.Context r2 = r2.getContext()
            X.4Uw r1 = r14.A0V
            X.2oK r0 = X.C51752oK.NONE
            if (r8 != r0) goto L_0x0199
            X.2IR r4 = r4.A03(r2, r1, r5)
        L_0x0123:
            X.05b r1 = r4.A0I
            if (r1 != 0) goto L_0x0130
            r0 = 8
            X.4Vc r1 = new X.4Vc
            r1.<init>(r4, r0)
            r4.A0I = r1
        L_0x0130:
            X.C012005e.A0V(r4, r1)
            X.0yC r1 = r4.A0G
            r0 = 3419(0xd5b, float:4.791E-42)
            r1.A0E(r0)
            boolean r0 = r4 instanceof X.C43482Hx
            if (r0 == 0) goto L_0x025e
            r12 = r4
            X.2Hx r12 = (X.C43482Hx) r12
            int r11 = r12.getMaxAlbumSize()
            int r0 = r12.getMinAlbumSize()
            java.util.ArrayList r10 = X.C36441kJ.A14(r0)
            r10.add(r5)
            boolean r9 = r14.A01(r4, r5)
            int r3 = r15 + 1
            r1 = r5
        L_0x0157:
            int r0 = r14.getCount()
            if (r3 >= r0) goto L_0x0259
            int r0 = r10.size()
            if (r0 >= r11) goto L_0x0259
            X.3T1 r2 = r14.getItem(r3)
            if (r2 == 0) goto L_0x0259
            int r0 = r3 + -1
            boolean r0 = r14.A03(r2, r1, r3, r0)
            if (r0 == 0) goto L_0x0259
            boolean r0 = r14.A02(r2)
            if (r0 == 0) goto L_0x0259
            r10.add(r2)
            boolean r0 = r14.A01(r4, r2)
            r9 = r9 | r0
            java.util.HashSet r0 = r14.A0N
            X.3Qa r1 = r2.A1J
            r0.remove(r1)
            java.util.HashSet r0 = r14.A0P
            r0.remove(r1)
            java.util.HashSet r0 = r14.A0M
            r0.remove(r1)
            java.util.HashSet r0 = r14.A0O
            r0.remove(r1)
            int r3 = r3 + 1
            r1 = r2
            goto L_0x0157
        L_0x0199:
            X.2IR r4 = X.AnonymousClass3QY.A00(r2, r8, r4, r1, r5)
            goto L_0x0123
        L_0x019e:
            boolean r0 = r5 instanceof X.C23043B1o
            if (r0 == 0) goto L_0x01ac
            X.3T1 r0 = r4.getFMessage()
            boolean r0 = r0 instanceof X.C23043B1o
            if (r0 == 0) goto L_0x01ac
            goto L_0x0100
        L_0x01ac:
            boolean r0 = r5 instanceof X.AnonymousClass5JB
            if (r0 == 0) goto L_0x01c3
            boolean r0 = r4 instanceof X.AnonymousClass2I3
            if (r0 == 0) goto L_0x01c3
            r1 = r4
            X.2I3 r1 = (X.AnonymousClass2I3) r1
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x0100
            X.141 r0 = r1.A03
            X.3IL r0 = r0.A0F
            if (r0 == 0) goto L_0x01c3
            goto L_0x0100
        L_0x01c3:
            boolean r0 = r4 instanceof X.AnonymousClass2I8
            if (r0 == 0) goto L_0x01d7
            X.3T1 r0 = r4.A0K
            X.11F r1 = X.C64933Qa.A01(r0)
            X.1A5 r0 = r4.A1C
            X.141 r0 = r0.A01(r1)
            X.3IL r0 = r0.A0F
            if (r0 == 0) goto L_0x0100
        L_0x01d7:
            boolean r0 = r5 instanceof X.C46812bi
            if (r0 == 0) goto L_0x01ef
            X.3T1 r0 = r4.getFMessage()
            boolean r0 = r0 instanceof X.C46812bi
            if (r0 == 0) goto L_0x01ef
            X.3T1 r0 = r4.getFMessage()
            X.3Jw r0 = r0.A0W()
            if (r0 == 0) goto L_0x01ef
            goto L_0x0100
        L_0x01ef:
            X.3KQ r10 = r5.A0N()
            boolean r0 = r4 instanceof X.C43492Hy
            if (r0 == 0) goto L_0x0201
            if (r10 == 0) goto L_0x0201
            X.2p4 r1 = r10.A00
            X.2p4 r0 = X.C52212p4.REELS
            if (r1 == r0) goto L_0x0201
            goto L_0x0100
        L_0x0201:
            boolean r0 = r4 instanceof X.C43502Hz
            if (r0 == 0) goto L_0x020f
            if (r10 == 0) goto L_0x020f
            X.2p4 r1 = r10.A00
            X.2p4 r0 = X.C52212p4.SEARCH
            if (r1 == r0) goto L_0x020f
            goto L_0x0100
        L_0x020f:
            r0 = 3575(0xdf7, float:5.01E-42)
            boolean r0 = r9.A0E(r0)
            if (r0 == 0) goto L_0x023d
            boolean r0 = r5 instanceof X.AnonymousClass2bV
            if (r0 == 0) goto L_0x023d
            boolean r0 = r4 instanceof X.AnonymousClass2IN
            if (r0 == 0) goto L_0x023d
            java.lang.String r9 = r5.A0b()
            X.AnonymousClass00C.A0D(r9, r6)
            boolean r0 = X.AnonymousClass3TC.A03(r9)
            if (r0 == 0) goto L_0x023d
            java.util.Map r1 = X.C63993Mf.A00
            java.lang.String r0 = X.AnonymousClass3TC.A00(r9)
            X.AnonymousClass00C.A08(r0)
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x023d
            goto L_0x0100
        L_0x023d:
            boolean r0 = r5 instanceof X.AnonymousClass2bE
            if (r0 != 0) goto L_0x0100
            java.lang.Class r1 = r5.getClass()
            X.3T1 r0 = r4.getFMessage()
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0100
            goto L_0x0123
        L_0x0255:
            java.lang.String r0 = "Conversation/isMessageValid number change message missing JID(s)."
            goto L_0x00a3
        L_0x0259:
            r12.A2F(r10, r9)
            goto L_0x0313
        L_0x025e:
            boolean r12 = r4 instanceof X.C43492Hy
            if (r12 != 0) goto L_0x0266
            boolean r0 = r4 instanceof X.C43502Hz
            if (r0 == 0) goto L_0x02dd
        L_0x0266:
            boolean r0 = r5 instanceof X.AnonymousClass2bV
            if (r0 == 0) goto L_0x02dd
            X.3S3 r11 = r14.A0W
            boolean r0 = r11.A01(r5)
            if (r0 != 0) goto L_0x02dd
            java.util.ArrayList r13 = X.AnonymousClass001.A0I()
            boolean r10 = r14.A01(r4, r5)
            r9 = r5
            X.2bV r9 = (X.AnonymousClass2bV) r9
            boolean r0 = X.AnonymousClass3S3.A00(r11, r5)
            if (r0 == 0) goto L_0x0290
            X.3KQ r0 = r5.A0N()
            if (r0 == 0) goto L_0x0290
            X.2p4 r0 = r0.A00
            if (r0 == 0) goto L_0x0290
            r13.add(r9)
        L_0x0290:
            int r3 = r15 + 1
            r2 = r9
        L_0x0293:
            int r0 = r14.getCount()
            if (r3 >= r0) goto L_0x0307
            int r1 = r13.size()
            r0 = 10
            if (r1 >= r0) goto L_0x0307
            X.3T1 r1 = r14.getItem(r3)
            if (r1 == 0) goto L_0x0307
            boolean r0 = r11.A02(r9, r1)
            if (r0 == 0) goto L_0x0307
            r9 = r1
            X.2bV r9 = (X.AnonymousClass2bV) r9
            boolean r0 = X.AnonymousClass3S3.A00(r11, r1)
            if (r0 == 0) goto L_0x02cb
            X.3KQ r0 = r1.A0N()
            if (r0 == 0) goto L_0x02cb
            X.2p4 r0 = r0.A00
            if (r0 == 0) goto L_0x02cb
            r13.add(r9)
        L_0x02c3:
            boolean r0 = r14.A01(r4, r1)
            r10 = r10 | r0
            int r3 = r3 + 1
            goto L_0x0293
        L_0x02cb:
            boolean r0 = X.AnonymousClass3S3.A00(r11, r1)
            if (r0 == 0) goto L_0x02c3
            X.3KQ r0 = r1.A0N()
            if (r0 == 0) goto L_0x02db
            X.2p4 r0 = r0.A00
            if (r0 != 0) goto L_0x02c3
        L_0x02db:
            r2 = r9
            goto L_0x02c3
        L_0x02dd:
            boolean r0 = r4 instanceof X.AnonymousClass2I6
            if (r0 == 0) goto L_0x02f0
            r1 = r4
            X.2I6 r1 = (X.AnonymousClass2I6) r1
            X.2oK r0 = X.C51752oK.BOTTOM
            boolean r0 = X.C36361kB.A1a(r8, r0)
            r1.A00 = r0
            r4.A22(r5, r6)
            goto L_0x0313
        L_0x02f0:
            if (r16 != 0) goto L_0x02f6
            boolean r0 = r4.A2H
            if (r0 == 0) goto L_0x0313
        L_0x02f6:
            boolean r0 = r14.A01(r4, r5)
            r4.A22(r5, r0)
            java.util.HashSet r1 = r14.A0N
            X.3Qa r0 = r5.A1J
            r1.remove(r0)
            r4.A2H = r6
            goto L_0x0313
        L_0x0307:
            if (r12 != 0) goto L_0x030d
            boolean r0 = r4 instanceof X.C43502Hz
            if (r0 == 0) goto L_0x0313
        L_0x030d:
            r0 = r4
            X.2He r0 = (X.C43352He) r0
            r0.A2J(r2, r13, r10)
        L_0x0313:
            int r0 = r14.A01
            r4.A04 = r0
            java.util.HashSet r1 = r14.A0P
            X.3Qa r9 = r5.A1J
            boolean r0 = r1.contains(r9)
            if (r0 == 0) goto L_0x0337
            r1.remove(r9)
            X.01L r0 = r14.A0S
            X.01N r0 = r0.A06
            X.01P r1 = r0.A02
            X.01P r0 = X.AnonymousClass01P.RESUMED
            int r0 = r1.compareTo(r0)
            if (r0 < 0) goto L_0x0337
            boolean r0 = r5.A15
            r4.A1i(r6, r0)
        L_0x0337:
            java.util.HashSet r1 = r14.A0M
            boolean r0 = r1.contains(r9)
            if (r0 == 0) goto L_0x0360
            r1.remove(r9)
            X.01L r0 = r14.A0S
            X.01N r0 = r0.A06
            X.01P r1 = r0.A02
            X.01P r0 = X.AnonymousClass01P.RESUMED
            int r0 = r1.compareTo(r0)
            if (r0 < 0) goto L_0x0360
            boolean r0 = r4 instanceof X.AnonymousClass2IM
            if (r0 != 0) goto L_0x0360
            int r0 = r5.A0E()
            r1 = 1
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            r4.A1i(r1, r0)
        L_0x0360:
            java.util.HashSet r1 = r14.A0O
            boolean r0 = r1.contains(r9)
            if (r0 == 0) goto L_0x038b
            r1.remove(r9)
            X.01L r0 = r14.A0S
            X.01N r0 = r0.A06
            X.01P r1 = r0.A02
            X.01P r0 = X.AnonymousClass01P.RESUMED
            int r0 = r1.compareTo(r0)
            if (r0 < 0) goto L_0x038b
            boolean r0 = r4 instanceof X.AnonymousClass2IM
            if (r0 != 0) goto L_0x038b
            X.5J2 r0 = r5.A1V
            if (r0 == 0) goto L_0x0386
            int r0 = r0.A00
            r1 = 1
            if (r0 == r1) goto L_0x0387
        L_0x0386:
            r1 = 0
        L_0x0387:
            r0 = 2
            r4.A1i(r0, r1)
        L_0x038b:
            X.3Qa r0 = r14.A0A
            r11 = 0
            if (r0 == 0) goto L_0x039b
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x039b
            r14.A0A = r11
            r4.A1f()
        L_0x039b:
            java.util.Set r3 = r14.A0R
            java.util.Iterator r1 = r3.iterator()
        L_0x03a1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03c2
            java.lang.Object r2 = r1.next()
            X.3Qa r2 = (X.C64933Qa) r2
            boolean r0 = r4.A2C(r2)
            if (r0 == 0) goto L_0x03a1
            r3.remove(r2)
            android.view.ViewTreeObserver r1 = r4.getViewTreeObserver()
            X.4Yl r0 = new X.4Yl
            r0.<init>(r2, r4, r14, r6)
            r1.addOnPreDrawListener(r0)
        L_0x03c2:
            X.2oK r10 = X.C51752oK.NONE
            if (r8 == r10) goto L_0x03ca
            X.2oK r0 = X.C51752oK.TOP
            if (r8 != r0) goto L_0x04c3
        L_0x03ca:
            r1 = 1
            if (r15 == 0) goto L_0x04c0
            int r0 = r15 + -1
            X.3T1 r11 = r14.getItem(r0)
            if (r11 == 0) goto L_0x04c0
            X.3T1 r0 = r14.A0G
            if (r11 != r0) goto L_0x03e3
            if (r15 <= r1) goto L_0x03e3
            int r0 = r15 + -2
            X.3T1 r0 = r14.getItem(r0)
            if (r0 != 0) goto L_0x03e4
        L_0x03e3:
            r0 = r11
        L_0x03e4:
            long r2 = r0.A0I
            long r0 = r5.A0I
            boolean r1 = X.AnonymousClass6XI.A04(r2, r0)
            r0 = r1 ^ 1
            r4.A24(r0)
        L_0x03f1:
            r12 = -1
            if (r8 != r10) goto L_0x04bc
            X.4Uw r0 = r14.A0V
            X.4Ux r8 = r0.getConversationRowCustomizer()
            boolean r0 = r8.Bsz()
            if (r0 != 0) goto L_0x04ba
            r10 = 6
            if (r1 == 0) goto L_0x04b5
            if (r11 == 0) goto L_0x04b5
            X.3Qa r0 = r11.A1J
            boolean r0 = r0.A02
            boolean r2 = r9.A02
            if (r0 != r2) goto L_0x04b5
            X.2nn r1 = X.AnonymousClass2IS.A0f(r8, r11)
            X.2nn r0 = X.C51422nn.NONE
            if (r1 == r0) goto L_0x04b5
            int r0 = r5.A0D
            if (r0 == r10) goto L_0x04b5
            int r0 = r11.A0D
            if (r0 == r10) goto L_0x04b5
            if (r2 != 0) goto L_0x042f
            X.11F r1 = r5.A0J()
            if (r1 == 0) goto L_0x042f
            X.11F r0 = r11.A0J()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x04b5
        L_0x042f:
            r13 = 1
        L_0x0430:
            int r0 = r15 + 1
            X.3T1 r11 = r14.getItem(r0)
            if (r11 == 0) goto L_0x046d
            long r2 = r11.A0I
            long r0 = r5.A0I
            boolean r0 = X.AnonymousClass6XI.A04(r2, r0)
            if (r0 == 0) goto L_0x046d
            X.3Qa r0 = r11.A1J
            boolean r0 = r0.A02
            boolean r2 = r9.A02
            if (r0 != r2) goto L_0x046d
            X.2nn r1 = X.AnonymousClass2IS.A0f(r8, r11)
            X.2nn r0 = X.C51422nn.NONE
            if (r1 == r0) goto L_0x046d
            int r0 = r5.A0D
            if (r0 == r10) goto L_0x046d
            int r0 = r11.A0D
            if (r0 == r10) goto L_0x046d
            if (r2 != 0) goto L_0x046c
            X.11F r1 = r5.A0J()
            if (r1 == 0) goto L_0x046c
            X.11F r0 = r11.A0J()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x046d
        L_0x046c:
            r6 = 1
        L_0x046d:
            if (r13 == 0) goto L_0x0471
            if (r6 != 0) goto L_0x04b3
        L_0x0471:
            X.2nn r1 = X.AnonymousClass2IS.A0f(r8, r5)
            X.2nn r0 = X.C51422nn.NONE
            if (r1 == r0) goto L_0x04b3
            if (r13 == 0) goto L_0x04b8
            r0 = 3
        L_0x047c:
            r4.A1g(r0)
        L_0x047f:
            X.38f r1 = r14.A09
            if (r1 == 0) goto L_0x04b2
            boolean r0 = r14.A0D
            if (r0 != 0) goto L_0x049f
            X.174 r0 = r14.A08
            if (r0 == 0) goto L_0x049f
            X.C18740tg.A01()
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x049f
            X.174 r0 = r14.A08
            X.C18740tg.A06(r0)
            X.0zf r0 = r0.A01
            r0.A06(r7)
            r0 = 1
            r14.A0D = r0
        L_0x049f:
            X.38f r1 = r14.A09
            X.C18740tg.A01()
            X.C18740tg.A01()
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x04b2
            X.15i r1 = r1.A02
            X.1fQ r0 = r4.A1j
            r0.A02(r1)
        L_0x04b2:
            return r4
        L_0x04b3:
            r0 = 2
            goto L_0x047c
        L_0x04b5:
            r13 = 0
            goto L_0x0430
        L_0x04b8:
            if (r6 == 0) goto L_0x04bc
        L_0x04ba:
            r0 = 1
            goto L_0x047c
        L_0x04bc:
            r4.A1g(r12)
            goto L_0x047f
        L_0x04c0:
            r4.A24(r1)
        L_0x04c3:
            r1 = 0
            goto L_0x03f1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38051nd.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        return (AnonymousClass000.A1R(this.A04) ? 1 : 0) + true;
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        throw AnonymousClass001.A09("should not be called, getView is defined");
    }

    public int A06(AnonymousClass3T1 r4) {
        int i;
        if (getCursor() != null && !this.A0E) {
            SparseArray sparseArray = this.A0H;
            int indexOfValue = sparseArray.indexOfValue(r4);
            if (indexOfValue >= 0) {
                i = sparseArray.keyAt(indexOfValue);
            } else {
                int i2 = 0;
                while (i2 < this.A07.size()) {
                    if (r4.equals(this.A07.get(i2))) {
                        i = i2 + this.A0F;
                    } else {
                        i2++;
                    }
                }
            }
            if (i >= A04()) {
                return i + 1;
            }
            return i;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0093, code lost:
        if (r5 == 0) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ab, code lost:
        if (A02(r1) != false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b0, code lost:
        if (r5 == 1) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00cf, code lost:
        if (r1.A02(r9, r0) != false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00d9, code lost:
        return X.C51752oK.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C51752oK A07(X.AnonymousClass3T1 r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8.A02(r9)
            if (r0 == 0) goto L_0x00ad
            X.3CN r0 = r8.A0I
            X.2oL r0 = r0.A00(r9)
            int r0 = r0.ordinal()
            r7 = 3
            r6 = 2
            r5 = 0
            r4 = 1
            if (r0 == r4) goto L_0x003d
            if (r0 == r7) goto L_0x00b3
            if (r0 != r6) goto L_0x00ad
            boolean r0 = r8.A0B
            if (r0 == 0) goto L_0x00ad
            int r3 = r10 + -1
            r2 = r9
        L_0x0021:
            if (r3 < 0) goto L_0x0096
            X.3T1 r1 = r8.getItem(r3)
            if (r1 == 0) goto L_0x0096
            int r0 = r3 + 1
            boolean r0 = r8.A03(r1, r2, r3, r0)
            if (r0 == 0) goto L_0x0096
            boolean r0 = r8.A02(r1)
            if (r0 == 0) goto L_0x0096
            int r5 = r5 + 1
            int r3 = r3 + -1
            r2 = r1
            goto L_0x0021
        L_0x003d:
            int r3 = r10 + -1
            r2 = r9
            r4 = 0
        L_0x0041:
            if (r3 < 0) goto L_0x005f
            if (r4 >= r7) goto L_0x005f
            X.3T1 r1 = r8.getItem(r3)
            if (r1 == 0) goto L_0x005f
            int r0 = r3 + 1
            boolean r0 = r8.A03(r1, r2, r3, r0)
            if (r0 == 0) goto L_0x005f
            boolean r0 = r8.A02(r1)
            if (r0 == 0) goto L_0x005f
            int r4 = r4 + 1
            int r3 = r3 + -1
            r2 = r1
            goto L_0x0041
        L_0x005f:
            int r3 = r10 + 1
        L_0x0061:
            int r0 = r8.getCount()
            r2 = 102(0x66, float:1.43E-43)
            if (r3 >= r0) goto L_0x0085
            if (r5 >= r2) goto L_0x0085
            X.3T1 r1 = r8.getItem(r3)
            if (r1 == 0) goto L_0x0085
            int r0 = r3 + -1
            boolean r0 = r8.A03(r1, r9, r3, r0)
            if (r0 == 0) goto L_0x0085
            boolean r0 = r8.A02(r1)
            if (r0 == 0) goto L_0x0085
            int r5 = r5 + 1
            int r3 = r3 + 1
            r9 = r1
            goto L_0x0061
        L_0x0085:
            int r1 = r4 + 1
            int r1 = r1 + r5
            r0 = 4
            if (r1 < r0) goto L_0x00ad
            if (r5 >= r2) goto L_0x00ad
            r0 = 101(0x65, float:1.42E-43)
            if (r5 == r0) goto L_0x00d4
            if (r4 == 0) goto L_0x00d4
            if (r5 != 0) goto L_0x00d7
            goto L_0x00d1
        L_0x0096:
            int r5 = r5 % r6
            if (r5 != 0) goto L_0x00b0
            int r0 = r10 + 1
            X.3T1 r1 = r8.getItem(r0)
            if (r1 == 0) goto L_0x00ad
            boolean r0 = r8.A03(r1, r9, r0, r10)
            if (r0 == 0) goto L_0x00ad
            boolean r0 = r8.A02(r1)
            if (r0 != 0) goto L_0x00d4
        L_0x00ad:
            X.2oK r0 = X.C51752oK.NONE
            return r0
        L_0x00b0:
            if (r5 != r4) goto L_0x00d7
            goto L_0x00d1
        L_0x00b3:
            int r0 = r10 + -1
            X.3T1 r0 = r8.getItem(r0)
            if (r0 == 0) goto L_0x00d4
            X.3S3 r1 = r8.A0W
            boolean r0 = r1.A02(r0, r9)
            if (r0 == 0) goto L_0x00d4
            int r0 = r10 + 1
            X.3T1 r0 = r8.getItem(r0)
            if (r0 == 0) goto L_0x00d1
            boolean r0 = r1.A02(r9, r0)
            if (r0 != 0) goto L_0x00d7
        L_0x00d1:
            X.2oK r0 = X.C51752oK.BOTTOM
            return r0
        L_0x00d4:
            X.2oK r0 = X.C51752oK.TOP
            return r0
        L_0x00d7:
            X.2oK r0 = X.C51752oK.BODY
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38051nd.A07(X.3T1, int):X.2oK");
    }

    public Cursor getCursor() {
        Cursor cursor = super.getCursor();
        if (cursor == null || !cursor.isClosed()) {
            return cursor;
        }
        return null;
    }

    public long getItemId(int i) {
        long j;
        AnonymousClass3T1 A082 = getItem(i);
        if (A082 == null) {
            return 0;
        }
        if (A082.A1N == 0) {
            j = (long) A082.A1J.hashCode();
        } else {
            j = A082.A1N;
        }
        return (j & 4294967295L) | (((long) A082.A1I) << 32);
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        this.A0C = false;
    }

    public void onContentChanged() {
    }
}
