package X;

import android.os.ConditionVariable;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.78b  reason: invalid class name */
public class AnonymousClass78b extends Thread {
    public final ConditionVariable A00 = new ConditionVariable(true);
    public final /* synthetic */ AnonymousClass6OM A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass78b(AnonymousClass6OM r3) {
        super("ReadyJobsProducer");
        this.A01 = r3;
    }

    public void run() {
        boolean z;
        Job job;
        while (true) {
            ConditionVariable conditionVariable = this.A00;
            conditionVariable.block();
            conditionVariable.close();
            AnonymousClass6OM r5 = this.A01;
            synchronized (r5) {
                LinkedList linkedList = r5.A01;
                z = false;
                job = null;
                if (!linkedList.isEmpty()) {
                    ListIterator listIterator = linkedList.listIterator();
                    HashMap A0J = AnonymousClass001.A0J();
                    while (true) {
                        if (!listIterator.hasNext()) {
                            break;
                        }
                        Job job2 = (Job) listIterator.next();
                        String str = job2.parameters.groupId;
                        if ((str == null || !r5.A03.contains(str)) && job2.A0C()) {
                            if (r5.A06 && !TextUtils.isEmpty(job2.parameters.groupId) && A0J.containsKey(job2.parameters.groupId)) {
                                Job job3 = (Job) A0J.get(job2.parameters.groupId);
                                if (job3.A0C()) {
                                    C116465kd r0 = r5.A00;
                                    if (r0 != null) {
                                        r0.A00.A01.A0E("JobQueue/DeterministicJobSelection/Fixed", (String) null, false);
                                    }
                                    while (listIterator.hasPrevious() && listIterator.previous() != job3) {
                                    }
                                    A0J.remove(job2.parameters.groupId);
                                    job2 = job3;
                                } else {
                                    C116465kd r02 = r5.A00;
                                    if (r02 != null) {
                                        r02.A00.A01.A0E("JobQueue/DeterministicJobSelection/Broken", (String) null, false);
                                    }
                                }
                            }
                            listIterator.remove();
                            String str2 = job2.parameters.groupId;
                            if (str2 != null) {
                                r5.A03.add(str2);
                                int A012 = r5.A01(str2);
                                if (A012 != 0) {
                                    if (A012 == 1) {
                                        r5.A02.remove(str2);
                                    } else {
                                        C36421kH.A1M(str2, r5.A02, A012 - 1);
                                    }
                                }
                            }
                            if (!r5.A04.offer(job2)) {
                                z = listIterator.hasNext();
                                job = job2;
                                break;
                            }
                        } else if (r5.A06 && !TextUtils.isEmpty(job2.parameters.groupId) && !A0J.containsKey(job2.parameters.groupId)) {
                            A0J.put(job2.parameters.groupId, job2);
                        }
                    }
                }
            }
            if (job != null) {
                if (z) {
                    conditionVariable.open();
                }
                try {
                    r5.A04.put(job);
                } catch (InterruptedException unused) {
                }
            }
        }
    }
}
