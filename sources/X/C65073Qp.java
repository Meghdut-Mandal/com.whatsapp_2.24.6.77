package X;

import android.content.ContentValues;

/* renamed from: X.3Qp  reason: invalid class name and case insensitive filesystem */
public class C65073Qp {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public long A0C = 1;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H = Long.MIN_VALUE;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L = 1;
    public long A0M = 0;
    public long A0N = 1;
    public long A0O = Long.MIN_VALUE;
    public long A0P = 1;
    public long A0Q = Long.MIN_VALUE;
    public long A0R;
    public long A0S;
    public long A0T = 0;
    public long A0U = 1;
    public long A0V = Long.MIN_VALUE;
    public long A0W = -1;
    public long A0X;
    public long A0Y;
    public C52152oy A0Z;
    public C62943Id A0a;
    public C80103un A0b;
    public AnonymousClass3T1 A0c;
    public AnonymousClass3T1 A0d;
    public AnonymousClass3G4 A0e;
    public AnonymousClass35M A0f;
    public String A0g;
    public String A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l = false;
    public boolean A0m = true;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public final AnonymousClass11F A0q;
    public volatile transient Boolean A0r;
    public volatile transient Boolean A0s;

    public synchronized long A01() {
        return this.A0M;
    }

    public synchronized long A02() {
        return this.A0T;
    }

    public synchronized long A03() {
        return this.A0X;
    }

    public synchronized ContentValues A04() {
        ContentValues contentValues;
        contentValues = new ContentValues(4);
        C36341k9.A0o(contentValues, "unseen_message_count", this.A08);
        C36341k9.A0o(contentValues, "unseen_comment_message_count", this.A05);
        C36341k9.A0o(contentValues, "unseen_missed_calls_count", this.A09);
        C36341k9.A0o(contentValues, "unseen_row_count", this.A0A);
        C36341k9.A0p(contentValues, "unseen_earliest_message_received_time", this.A0Y);
        return contentValues;
    }

    public synchronized ContentValues A05(Long l) {
        ContentValues A0E2;
        A0E2 = C36441kJ.A0E();
        C36341k9.A0p(A0E2, "display_message_row_id", this.A0U);
        C36341k9.A0p(A0E2, "display_message_sort_id", this.A0V);
        C36341k9.A0p(A0E2, "last_message_row_id", this.A0N);
        C36341k9.A0p(A0E2, "last_message_sort_id", this.A0O);
        C36341k9.A0p(A0E2, "last_read_message_row_id", this.A0P);
        C36341k9.A0p(A0E2, "last_read_message_sort_id", this.A0Q);
        C36341k9.A0p(A0E2, "last_read_receipt_sent_message_row_id", this.A0R);
        C36341k9.A0p(A0E2, "last_read_receipt_sent_message_sort_id", this.A0S);
        C36341k9.A0p(A0E2, "unseen_earliest_message_received_time", this.A0Y);
        C36341k9.A0o(A0E2, "unseen_message_count", this.A08);
        C36341k9.A0o(A0E2, "unseen_missed_calls_count", this.A09);
        C36341k9.A0o(A0E2, "unseen_row_count", this.A0A);
        C36341k9.A0p(A0E2, "last_important_message_row_id", this.A0L);
        int i = 1;
        C36341k9.A0o(A0E2, "show_group_description", AnonymousClass000.A1P(this.A0p ? 1 : 0) ? 1 : 0);
        C36341k9.A0o(A0E2, "ephemeral_expiration", this.A0b.expiration);
        C36341k9.A0p(A0E2, "ephemeral_setting_timestamp", this.A0b.ephemeralSettingTimestamp);
        C36341k9.A0o(A0E2, "ephemeral_disappearing_messages_initiator", this.A0b.disappearingMessagesInitiator);
        A0E2.put("subject", this.A0h);
        C36341k9.A0o(A0E2, "archived", AnonymousClass000.A1P(this.A0i ? 1 : 0) ? 1 : 0);
        C36341k9.A0p(A0E2, "sort_timestamp", this.A0X);
        C36341k9.A0p(A0E2, "change_number_notified_message_row_id", this.A0C);
        C36341k9.A0o(A0E2, "spam_detection", this.A04);
        C36341k9.A0o(A0E2, "plaintext_disabled", this.A00);
        C36341k9.A0o(A0E2, "vcard_ui_dismissed", this.A0B);
        if (l != null) {
            A0E2.put("created_timestamp", l);
        }
        C36341k9.A0o(A0E2, "unseen_important_message_count", this.A06);
        C36341k9.A0o(A0E2, "group_type", this.A02);
        C36341k9.A0o(A0E2, "unseen_message_reaction_count", this.A07);
        C36341k9.A0o(A0E2, "unseen_comment_message_count", this.A05);
        C36341k9.A0p(A0E2, "last_message_reaction_row_id", this.A0M);
        C36341k9.A0p(A0E2, "last_seen_message_reaction_row_id", this.A0T);
        A0E2.put("has_new_community_admin_dialog_been_acknowledged", Boolean.valueOf(this.A0k));
        C36341k9.A0o(A0E2, "history_sync_progress", this.A03);
        C36341k9.A0o(A0E2, "chat_lock", AnonymousClass000.A1P(this.A0j ? 1 : 0) ? 1 : 0);
        if (!this.A0o) {
            i = 0;
        }
        C36341k9.A0o(A0E2, "hidden", i);
        C52152oy r0 = this.A0Z;
        if (r0 != null) {
            A0E2.put("chat_origin", r0.origin);
        }
        return A0E2;
    }

    public synchronized AnonymousClass11F A06() {
        return this.A0q;
    }

    public synchronized Long A07() {
        return Long.valueOf(this.A0W);
    }

    public synchronized String A08() {
        return this.A0h;
    }

    public synchronized String A09() {
        StringBuilder A0u;
        A0u = AnonymousClass000.A0u();
        A0u.append(this.A0A);
        A0u.append("/");
        A0u.append(this.A08);
        A0u.append("/");
        A0u.append(this.A09);
        A0u.append("/");
        A0u.append(this.A0Y);
        A0u.append("/");
        A0u.append(this.A06);
        A0u.append("/");
        return C36411kG.A11(A0u, this.A0M - this.A0T);
    }

    public synchronized void A0A() {
        this.A0d = null;
        this.A0c = null;
        this.A0f = null;
        this.A0U = 1;
        this.A0V = Long.MIN_VALUE;
        this.A0N = 1;
        this.A0O = Long.MIN_VALUE;
        this.A0L = 1;
        this.A0P = 1;
        this.A0Q = Long.MIN_VALUE;
        this.A0R = 1;
        this.A0S = Long.MIN_VALUE;
        this.A0H = Long.MIN_VALUE;
        A0H(0, 0, 0, 0);
    }

    public synchronized void A0B(int i) {
        this.A04 = i;
    }

    public synchronized void A0D(long j) {
        this.A0U = j;
    }

    public synchronized void A0E(long j) {
        this.A0V = j;
    }

    public synchronized void A0F(long j) {
        this.A0X = j;
    }

    public synchronized void A0G(String str, long j, long j2, long j3, long j4) {
        this.A0F = j;
        this.A0G = j2;
        this.A0D = j3;
        this.A0E = j4;
        this.A0g = str;
        this.A0s = null;
        this.A0r = null;
    }

    public synchronized boolean A0H(int i, int i2, int i3, int i4) {
        if (this.A08 == i && this.A09 == i2 && this.A0A == i3 && this.A06 == i4) {
            return false;
        }
        if (i <= 0) {
            this.A0Y = 0;
        }
        this.A08 = i;
        this.A06 = i4;
        this.A09 = i2;
        this.A0A = i3;
        this.A05 = 0;
        return true;
    }

    public void A0C(int i, long j, int i2) {
        this.A0b = new C80103un(i, j, i2);
    }

    public boolean A0I(Boolean bool, int i) {
        C62943Id r1 = new C62943Id(bool, i);
        C62943Id r0 = this.A0a;
        if (r0 != null && r0.equals(r1)) {
            return false;
        }
        this.A0a = r1;
        return true;
    }

    public C65073Qp(C65073Qp r7) {
        this.A0q = r7.A0q;
        this.A0W = r7.A0W;
        this.A0U = r7.A0U;
        this.A0V = r7.A0V;
        this.A0d = r7.A0d;
        this.A0c = r7.A0c;
        this.A0f = r7.A0f;
        this.A0P = r7.A0P;
        this.A0Q = r7.A0Q;
        this.A0R = r7.A0R;
        this.A0S = r7.A0S;
        this.A0i = r7.A0i;
        this.A0X = r7.A0X;
        this.A04 = r7.A04;
        this.A00 = r7.A00;
        this.A0B = r7.A0B;
        this.A0h = r7.A0h;
        this.A0H = r7.A0H;
        this.A0Y = r7.A0Y;
        this.A03 = r7.A03;
        this.A08 = r7.A08;
        this.A09 = r7.A09;
        this.A0A = r7.A0A;
        this.A06 = r7.A06;
        this.A07 = r7.A07;
        this.A05 = r7.A05;
        this.A0M = r7.A0M;
        this.A0T = r7.A0T;
        this.A0N = r7.A0N;
        this.A0L = r7.A0L;
        this.A0F = r7.A0F;
        this.A0G = r7.A0G;
        this.A0D = r7.A0D;
        this.A0E = r7.A0E;
        this.A0g = r7.A0g;
        this.A0C = r7.A0C;
        this.A0p = r7.A0p;
        this.A0k = r7.A0k;
        this.A0m = r7.A0m;
        this.A0l = r7.A0l;
        this.A01 = r7.A01;
        this.A0b = r7.A0b;
        this.A02 = r7.A02;
        this.A0K = r7.A0K;
        this.A0J = r7.A0J;
        this.A0I = r7.A0I;
        this.A0e = r7.A0e;
        this.A0n = r7.A0n;
        this.A0o = r7.A0o;
        this.A0s = r7.A0s;
        this.A0r = r7.A0r;
        this.A0O = r7.A0O;
        this.A0Z = r7.A0Z;
        this.A0a = r7.A0a;
    }

    public C65073Qp(AnonymousClass11F r7) {
        this.A0q = r7;
        this.A01 = 0;
        this.A0b = new C80103un(0, 0, 0);
        this.A0F = Long.MIN_VALUE;
        this.A0G = Long.MIN_VALUE;
        this.A0D = Long.MIN_VALUE;
        this.A0E = Long.MIN_VALUE;
    }
}
