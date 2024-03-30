package X;

import com.whatsapp.R;

/* renamed from: X.5gk  reason: invalid class name and case insensitive filesystem */
public abstract class C114155gk {
    public static final AnonymousClass38I[] A00;
    public static final AnonymousClass38I[] A01;
    public static final AnonymousClass38I A02;
    public static final AnonymousClass38I A03;
    public static final AnonymousClass38I A04;
    public static final AnonymousClass38I A05;
    public static final AnonymousClass38I A06;
    public static final AnonymousClass38I A07;
    public static final AnonymousClass38I A08;
    public static final AnonymousClass38I A09;

    public static AnonymousClass38I A00(Object obj, int i, int i2, int i3) {
        return new AnonymousClass38I(new C165307tD(obj, 7), i, i2, i3);
    }

    static {
        AnonymousClass38I A002 = A00(AnonymousClass6JA.A05, R.id.emoji_people_btn, R.id.emoji_people_marker, R.string.f12nameremoved);
        A07 = A002;
        AnonymousClass38I A003 = A00(AnonymousClass6JA.A03, R.id.emoji_nature_btn, R.id.emoji_nature_marker, R.string.f12nameremoved);
        A05 = A003;
        AnonymousClass38I A004 = A00(AnonymousClass6JA.A02, R.id.emoji_food_btn, R.id.emoji_food_marker, R.string.f12nameremoved);
        A04 = A004;
        AnonymousClass38I A005 = A00(AnonymousClass6JA.A00, R.id.emoji_activity_btn, R.id.emoji_activity_marker, R.string.f12nameremoved);
        A02 = A005;
        AnonymousClass38I A006 = A00(AnonymousClass6JA.A07, R.id.emoji_travel_btn, R.id.emoji_travel_marker, R.string.f12nameremoved);
        A09 = A006;
        AnonymousClass38I A007 = A00(AnonymousClass6JA.A04, R.id.emoji_objects_btn, R.id.emoji_objects_marker, R.string.f12nameremoved);
        A06 = A007;
        AnonymousClass38I A008 = A00(AnonymousClass6JA.A06, R.id.emoji_symbols_btn, R.id.emoji_symbols_marker, R.string.f12nameremoved);
        A08 = A008;
        AnonymousClass38I A009 = A00(AnonymousClass6JA.A01, R.id.emoji_flags_btn, R.id.emoji_flags_marker, R.string.f12nameremoved);
        A03 = A009;
        AnonymousClass38I[] r9 = new AnonymousClass38I[8];
        C36321k7.A1F(A002, A003, A004, A005, r9);
        C36381kD.A1L(A006, A007, r9);
        r9[6] = A008;
        r9[7] = A009;
        A00 = r9;
        C18910u1 r8 = C113725g1.A00;
        AnonymousClass38I[] r6 = new AnonymousClass38I[8];
        int i = 0;
        do {
            AnonymousClass38I r1 = r9[i];
            r6[i] = new AnonymousClass38I(new C65863Tt(r1, r8, 1), r1.A00, r1.A01, r1.A02);
            i++;
        } while (i < 8);
        A01 = r6;
    }
}
