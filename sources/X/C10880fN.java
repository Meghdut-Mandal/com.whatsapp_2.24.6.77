package X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.0fN  reason: invalid class name and case insensitive filesystem */
public final class C10880fN implements Serializable {
    public Set _options;
    public final Pattern nativePattern;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10880fN(java.lang.String r2) {
        /*
            r1 = this;
            r0 = 1
            X.AnonymousClass00C.A0D(r2, r0)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r2)
            X.AnonymousClass00C.A08(r0)
            r1.<init>((java.util.regex.Pattern) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10880fN.<init>(java.lang.String):void");
    }

    public final String A00(CharSequence charSequence, String str) {
        AnonymousClass00C.A0D(charSequence, 0);
        String replaceAll = this.nativePattern.matcher(charSequence).replaceAll(str);
        AnonymousClass00C.A08(replaceAll);
        return replaceAll;
    }

    public final List A01(CharSequence charSequence, int i) {
        AnonymousClass00C.A0D(charSequence, 0);
        Matcher matcher = this.nativePattern.matcher(charSequence);
        if (i == 1 || !matcher.find()) {
            List singletonList = Collections.singletonList(charSequence.toString());
            AnonymousClass00C.A08(singletonList);
            return singletonList;
        }
        int i2 = 10;
        if (i > 0) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = 0;
        int i4 = i - 1;
        do {
            arrayList.add(charSequence.subSequence(i3, matcher.start()).toString());
            i3 = matcher.end();
            if ((i4 >= 0 && arrayList.size() == i4) || !matcher.find()) {
                arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i3, matcher.start()).toString());
            i3 = matcher.end();
            break;
        } while (!matcher.find());
        arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
        return arrayList;
    }

    public final boolean A03(CharSequence charSequence) {
        AnonymousClass00C.A0D(charSequence, 0);
        return this.nativePattern.matcher(charSequence).matches();
    }

    private final Object writeReplace() {
        String pattern = this.nativePattern.pattern();
        AnonymousClass00C.A08(pattern);
        return new C10860fL(pattern, this.nativePattern.flags());
    }

    public final AnonymousClass0T4 A02(CharSequence charSequence) {
        Matcher matcher = this.nativePattern.matcher(charSequence);
        AnonymousClass00C.A08(matcher);
        if (!matcher.find(0)) {
            return null;
        }
        return new AnonymousClass0T4(charSequence, matcher);
    }

    public String toString() {
        String obj = this.nativePattern.toString();
        AnonymousClass00C.A08(obj);
        return obj;
    }

    public C10880fN(Pattern pattern) {
        this.nativePattern = pattern;
    }
}
