package X;

import com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity;

/* renamed from: X.7ry  reason: invalid class name and case insensitive filesystem */
public class C164537ry implements C159327jB {
    public Object A00;
    public final int A01;

    public C164537ry(DirectorySetLocationMapActivity directorySetLocationMapActivity, int i) {
        this.A01 = i;
        this.A00 = directorySetLocationMapActivity;
    }

    public void BYT(int i, int i2) {
        int i3 = this.A01;
        DirectorySetLocationMapActivity directorySetLocationMapActivity = (DirectorySetLocationMapActivity) this.A00;
        if (i3 != 0) {
            DirectorySetLocationMapActivity.A07(new C163297py(this, 15), new C143556qk(this, i, i2), directorySetLocationMapActivity, i);
            return;
        }
        directorySetLocationMapActivity.A0A.A06.setVisibility(8);
        directorySetLocationMapActivity.A0A.A00();
    }
}
