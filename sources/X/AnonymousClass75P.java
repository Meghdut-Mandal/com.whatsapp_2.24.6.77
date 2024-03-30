package X;

import java.text.CharacterIterator;

/* renamed from: X.75P  reason: invalid class name */
public final class AnonymousClass75P implements CharacterIterator {
    public int A00 = 0;
    public final int A01;
    public final CharSequence A02;

    public AnonymousClass75P(CharSequence charSequence, int i) {
        this.A02 = charSequence;
        this.A01 = i;
    }

    public char first() {
        this.A00 = 0;
        return current();
    }

    public char last() {
        int i = this.A01;
        if (0 == i) {
            this.A00 = i;
            return 65535;
        }
        int i2 = i - 1;
        this.A00 = i2;
        return this.A02.charAt(i2);
    }

    public char setIndex(int i) {
        if (i > this.A01 || 0 > i) {
            throw AnonymousClass001.A08("invalid position");
        }
        this.A00 = i;
        return current();
    }

    public char current() {
        int i = this.A00;
        if (i == this.A01) {
            return 65535;
        }
        return this.A02.charAt(i);
    }

    public char next() {
        int i = this.A00 + 1;
        this.A00 = i;
        int i2 = this.A01;
        if (i < i2) {
            return this.A02.charAt(i);
        }
        this.A00 = i2;
        return 65535;
    }

    public char previous() {
        int i = this.A00;
        if (i <= 0) {
            return 65535;
        }
        int i2 = i - 1;
        this.A00 = i2;
        return this.A02.charAt(i2);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public int getBeginIndex() {
        return 0;
    }

    public int getEndIndex() {
        return this.A01;
    }

    public int getIndex() {
        return this.A00;
    }
}
