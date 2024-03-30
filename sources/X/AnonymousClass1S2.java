package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1S2  reason: invalid class name */
public class AnonymousClass1S2 {
    public boolean A00;
    public final AnonymousClass08S A01;
    public final AnonymousClass08S A02;
    public final C001700s A03 = new C001700s();
    public final C235718z A04;
    public final AnonymousClass1A6 A05;
    public final AnonymousClass1A5 A06;
    public final C21010yW A07;
    public final C21690ze A08;
    public final AnonymousClass1S0 A09;
    public final AnonymousClass1S3 A0A;
    public final C28091Rh A0B;
    public final C19970wo A0C;
    public final AtomicInteger A0D = new AtomicInteger();

    public static String A00(AnonymousClass1S2 r2, AnonymousClass1S3 r3) {
        StringBuilder sb = new StringBuilder();
        sb.append("chatSearchManager/getContactsForQuery/");
        sb.append(r2.A0D.getAndIncrement());
        sb.append("/");
        sb.append(r3.A02().length());
        return sb.toString();
    }

    public AnonymousClass1S2(C001600r r5, C001600r r6, C001600r r7, C001600r r8, C235718z r9, AnonymousClass1A6 r10, C19970wo r11, C18820ts r12, AnonymousClass1A5 r13, C21010yW r14, C21690ze r15, AnonymousClass1S0 r16, C28091Rh r17, C28271Rz r18) {
        AnonymousClass08S r2 = new AnonymousClass08S();
        this.A02 = r2;
        AnonymousClass08S r3 = new AnonymousClass08S();
        this.A01 = r3;
        this.A0C = r11;
        this.A07 = r14;
        this.A04 = r9;
        this.A0B = r17;
        this.A05 = r10;
        this.A09 = r16;
        this.A06 = r13;
        this.A08 = r15;
        this.A0A = new AnonymousClass1S3(r12);
        r18.A00(new C36141jp(this, 0), r2, r3);
        r2.A0F(r5, new C36201jv(this, 10));
        r2.A0F(r6, new C36201jv(this, 9));
        r2.A0F(r7, new C36201jv(this, 7));
        r2.A0F(r8, new C36201jv(this, 8));
    }
}
