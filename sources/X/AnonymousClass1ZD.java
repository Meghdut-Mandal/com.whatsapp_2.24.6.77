package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.PriorityQueue;

/* renamed from: X.1ZD  reason: invalid class name */
public final class AnonymousClass1ZD extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass1Z9 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1ZD(AnonymousClass1Z9 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = this.this$0.A04.A03().iterator();
        while (it.hasNext()) {
            C128646Db r3 = (C128646Db) it.next();
            String str = r3.A06;
            Object obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new PriorityQueue(1);
            }
            PriorityQueue priorityQueue = (PriorityQueue) obj;
            priorityQueue.offer(Integer.valueOf(r3.A00));
            linkedHashMap.put(str, priorityQueue);
        }
        return linkedHashMap;
    }
}
