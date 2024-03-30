package X;

import java.io.File;
import java.util.ArrayDeque;

/* renamed from: X.0ju  reason: invalid class name and case insensitive filesystem */
public final class C13460ju extends C12340ht {
    public final ArrayDeque A00;
    public final /* synthetic */ C12740ia A01;

    public C13460ju(C12740ia r5) {
        Object r0;
        this.A01 = r5;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.A00 = arrayDeque;
        File file = r5.A00;
        if (file.isDirectory()) {
            if (this.A01.A01.ordinal() != 0) {
                r0 = new C14330lS(file, this);
            } else {
                r0 = new C14320lR(file, this);
            }
        } else if (file.isFile()) {
            r0 = new C14350lU(file, this);
        } else {
            this.A01 = AnonymousClass0Ng.Done;
            return;
        }
        arrayDeque.push(r0);
    }

    public void A00() {
        AnonymousClass0Ng r0;
        File A002;
        Object r02;
        while (true) {
            ArrayDeque arrayDeque = this.A00;
            C06410Tm r03 = (C06410Tm) arrayDeque.peek();
            if (r03 == null) {
                r0 = AnonymousClass0Ng.Done;
                break;
            }
            A002 = r03.A00();
            if (A002 == null) {
                arrayDeque.pop();
            } else if (A002.equals(r03.A00) || !A002.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                this.A00 = A002;
                r0 = AnonymousClass0Ng.Ready;
            } else {
                if (this.A01.A01.ordinal() != 0) {
                    r02 = new C14330lS(A002, this);
                } else {
                    r02 = new C14320lR(A002, this);
                }
                arrayDeque.push(r02);
            }
        }
        this.A00 = A002;
        r0 = AnonymousClass0Ng.Ready;
        this.A01 = r0;
    }
}
