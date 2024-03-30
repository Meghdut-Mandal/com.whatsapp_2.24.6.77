package X;

import com.whatsapp.jobqueue.requirement.ChatConnectionRequirement;
import java.util.List;
import org.whispersystems.jobqueue.JobParameters;
import org.whispersystems.jobqueue.requirements.Requirement;

/* renamed from: X.673  reason: invalid class name */
public class AnonymousClass673 {
    public String A00 = null;
    public boolean A01 = false;
    public List A02 = C90524aI.A0l();

    public static void A00(AnonymousClass673 r1) {
        r1.A01 = true;
        r1.A02(new ChatConnectionRequirement());
    }

    public JobParameters A01() {
        return new JobParameters(this.A00, this.A02, this.A01);
    }

    public void A02(Requirement requirement) {
        this.A02.add(requirement);
    }
}
