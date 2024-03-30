package X;

/* renamed from: X.4oj  reason: invalid class name and case insensitive filesystem */
public class C97264oj extends C130666Ly {
    public C124895yy A00;
    public final C130976Nf A01;

    public static final void A00(C162177o9 r3) {
        r3.B6z("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '");
        A0u.append("5181942b9ebc31ce68dacb56c16fd79f");
        r3.B6z(AnonymousClass000.A0q("')", A0u));
    }

    public C97264oj(C124895yy r1, C130976Nf r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
