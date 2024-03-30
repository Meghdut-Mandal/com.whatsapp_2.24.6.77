package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.6oN  reason: invalid class name and case insensitive filesystem */
public final class C142126oN implements C160607lH {
    public Integer A00;
    public Object A01;
    public String A02;
    public final Stack A03;
    public final Stack A04;
    public final C142136oO A05 = new C142136oO();
    public final C124125xd A06;

    public Integer BQE() {
        AnonymousClass5S8 r0;
        Integer num;
        this.A02 = null;
        this.A00 = null;
        Stack stack = this.A03;
        Stack stack2 = this.A04;
        Iterator it = (Iterator) stack2.peek();
        int ordinal = ((AnonymousClass5S8) stack.peek()).ordinal();
        if (ordinal == 0) {
            this.A00 = C023109s.A0C;
            stack.pop();
            r0 = AnonymousClass5S8.ObjectReadName;
            stack.push(r0);
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                stack.pop();
                stack.push(AnonymousClass5S8.ObjectReadName);
            } else if (ordinal == 3) {
                this.A00 = C023109s.A00;
                stack.pop();
                r0 = AnonymousClass5S8.ArrayReadValue;
                stack.push(r0);
            } else if (ordinal == 4) {
                this.A01 = null;
                if (it.hasNext()) {
                    this.A01 = it.next();
                } else {
                    this.A00 = C023109s.A01;
                    stack2.pop();
                    stack.pop();
                }
            }
            Object obj = this.A01;
            if (obj == null) {
                num = C023109s.A0Y;
            } else if (obj instanceof Boolean) {
                num = C023109s.A0X;
            } else if (obj instanceof Number) {
                num = C023109s.A0W;
            } else if (obj instanceof AnonymousClass6JJ) {
                num = C023109s.A0V;
            } else if (obj instanceof String) {
                num = C023109s.A0S;
            } else if (obj instanceof List) {
                stack2.push(C90514aH.A13(obj));
                stack.push(AnonymousClass5S8.ArrayReadValue);
                num = C023109s.A00;
            } else if (obj instanceof Map) {
                stack2.push(AnonymousClass000.A0y((Map) obj));
                stack.push(AnonymousClass5S8.ObjectReadName);
                num = C023109s.A0C;
            } else {
                throw AnonymousClass000.A0f(obj, "unknown value type", AnonymousClass000.A0u());
            }
            this.A00 = num;
        } else {
            this.A01 = null;
            if (it.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(it);
                this.A02 = C90494aF.A0f(A11);
                this.A01 = A11.getValue();
                this.A00 = C023109s.A0R;
                stack.pop();
                r0 = AnonymousClass5S8.ObjectReadValue;
                stack.push(r0);
            } else {
                this.A00 = C023109s.A0G;
                stack.pop();
                stack2.pop();
            }
        }
        return this.A00;
    }

    public C160707lS BlP() {
        C142136oO r1 = this.A05;
        r1.A00 = this.A01;
        return r1;
    }

    public void BuF() {
        Integer num = this.A00;
        Integer num2 = C023109s.A00;
        if (num == num2 || num == C023109s.A0C) {
            int i = 1;
            while (true) {
                Integer BQE = BQE();
                if (BQE == num2 || BQE == C023109s.A0C) {
                    i++;
                } else if (BQE == C023109s.A01 || BQE == C023109s.A0G) {
                    i--;
                }
                if (i == 0) {
                    return;
                }
            }
        }
    }

    public C142126oN(C124125xd r4, Iterator it) {
        Stack stack = new Stack();
        this.A04 = stack;
        Stack stack2 = new Stack();
        this.A03 = stack2;
        this.A06 = r4;
        stack.add(it);
        stack2.add(AnonymousClass5S8.ReadObject);
    }

    public String BlN() {
        return this.A02;
    }

    public Integer BlO() {
        return this.A00;
    }
}
