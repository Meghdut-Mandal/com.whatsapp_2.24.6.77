package X;

import com.whatsapp.payments.PaymentConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: X.8ah  reason: invalid class name and case insensitive filesystem */
public class C175568ah extends C183618r5 {
    public final AnonymousClass16S A00;
    public final String A01;
    public final Set A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList A09 = this.A00.A09();
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = A09.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!this.A02.contains(next)) {
                A0I.add(next);
            }
        }
        Set set = this.A02;
        A0I.addAll(set);
        C192489He A0G = A0G(this.A01, A0I);
        ArrayList A14 = C36441kJ.A14(set.size());
        for (Object next2 : A0G.A00) {
            if (set.contains(next2)) {
                A14.add(next2);
            }
        }
        return new C192489He(A14, A0G.A01);
    }

    public C175568ah(C22935Ayl ayl, AnonymousClass16S r4, PaymentConfiguration paymentConfiguration, C19770wU r6, String str, List list) {
        super(ayl, r4, paymentConfiguration, r6);
        this.A00 = r4;
        TreeSet treeSet = new TreeSet(AXa.A00);
        this.A02 = treeSet;
        treeSet.addAll(list);
        this.A01 = str;
    }
}
