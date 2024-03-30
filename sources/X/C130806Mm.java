package X;

import android.os.Bundle;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.fieldstats.extension.WamCallExtended;
import com.whatsapp.fieldstats.extension.WamCallExtendedField;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.6Mm  reason: invalid class name and case insensitive filesystem */
public class C130806Mm {
    public final C21010yW A00;
    public final C25781Hq A01;
    public final AnonymousClass13J A02;

    public void A01(WamCall wamCall, boolean z) {
        long j;
        this.A01.A01 = wamCall;
        Long l = wamCall.logSampleRatio;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 1;
        }
        wamCall.logSampleRatio = null;
        C21010yW r1 = this.A00;
        r1.Blz(wamCall, (int) j);
        if (z) {
            r1.BP7();
        }
    }

    public C130806Mm(C25781Hq r1, C21010yW r2, AnonymousClass13J r3) {
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = r1;
    }

    public static Bundle A00(Object obj) {
        Bundle A07 = AnonymousClass001.A07();
        Class<?> cls = obj.getClass();
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList A0I = AnonymousClass001.A0I();
        if (WamCallExtended.class == cls && cls.getSuperclass() != null) {
            Collections.addAll(A0I, cls.getSuperclass().getDeclaredFields());
        }
        Collections.addAll(A0I, declaredFields);
        Iterator it = A0I.iterator();
        while (it.hasNext()) {
            Field field = (Field) it.next();
            int modifiers = field.getModifiers();
            if (Modifier.isPublic(modifiers) && !Modifier.isStatic(modifiers)) {
                String name = field.getName();
                try {
                    Object obj2 = field.get(obj);
                    if (obj2 != null) {
                        if (obj2 instanceof Double) {
                            A07.putDouble(name, C90504aG.A01(obj2));
                        } else if (obj2 instanceof Integer) {
                            A07.putInt(name, AnonymousClass000.A0I(obj2));
                        } else if (obj2 instanceof Long) {
                            A07.putLong(name, C36431kI.A09(obj2));
                        } else if (obj2 instanceof Boolean) {
                            A07.putBoolean(name, AnonymousClass000.A1X(obj2));
                        } else if (obj2 instanceof String) {
                            A07.putString(name, (String) obj2);
                        } else if (!name.equals("fields") || !(obj2 instanceof ArrayList)) {
                            StringBuilder A0u = AnonymousClass000.A0u();
                            A0u.append("unexpected member ");
                            A0u.append(name);
                            C18740tg.A0D(false, AnonymousClass000.A0q(" in fieldstats event, only Double, Integer, and String members are supported", A0u));
                        } else {
                            ArrayList A0I2 = AnonymousClass001.A0I();
                            Iterator it2 = ((AbstractCollection) obj2).iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                if (next instanceof WamCallExtendedField) {
                                    A0I2.add(next);
                                }
                            }
                            A07.putParcelableArrayList(name, A0I2);
                        }
                    }
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException(e);
                }
            }
        }
        return A07;
    }
}
