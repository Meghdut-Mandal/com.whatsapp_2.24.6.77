package X;

import com.whatsapp.data.ConversationDeleteWorker;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3hY  reason: invalid class name and case insensitive filesystem */
public class C71923hY implements AnonymousClass4V8 {
    public final /* synthetic */ ConversationDeleteWorker A00;
    public final /* synthetic */ AnonymousClass3B8 A01;

    public C71923hY(ConversationDeleteWorker conversationDeleteWorker, AnonymousClass3B8 r2) {
        this.A00 = conversationDeleteWorker;
        this.A01 = r2;
    }

    public void BY0() {
        ConversationDeleteWorker.A0C.addAndGet(-1);
        ConversationDeleteWorker.A00(this.A00);
    }

    public void Bdh(int i, int i2) {
        this.A00.A0A(this.A01.A07, i);
    }

    public void Bh7() {
        int A02;
        ConversationDeleteWorker.A0C.addAndGet(1);
        AnonymousClass11F r4 = this.A01.A07;
        ConversationDeleteWorker conversationDeleteWorker = this.A00;
        ConcurrentHashMap concurrentHashMap = ConversationDeleteWorker.A0B;
        concurrentHashMap.putIfAbsent(r4, new AnonymousClass34T());
        AnonymousClass34T r3 = (AnonymousClass34T) concurrentHashMap.get(r4);
        int A022 = conversationDeleteWorker.A02.A02(r4);
        synchronized (r3) {
            int i = r3.A01;
            A02 = AnonymousClass001.A02(A022, i, 0);
            r3.A01 = i + A02;
        }
        ConversationDeleteWorker.A0D.addAndGet(A02);
    }

    public boolean BtY() {
        return this.A00.A03;
    }
}
