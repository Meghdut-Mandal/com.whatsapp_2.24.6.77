package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0XJ  reason: invalid class name */
public abstract class AnonymousClass0XJ {
    public final AnonymousClass008 A00;
    public final AnonymousClass008 A01;
    public final AnonymousClass008 A02;

    public abstract C03880Ig A03();

    public C15820o2 A04() {
        String readString = ((C03880Ig) this).A03.readString();
        if (readString == null) {
            return null;
        }
        C03880Ig A03 = A03();
        Class<AnonymousClass0XJ> cls = AnonymousClass0XJ.class;
        try {
            AnonymousClass008 r3 = this.A00;
            Method method = (Method) r3.get(readString);
            if (method == null) {
                System.currentTimeMillis();
                method = Class.forName(readString, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
                r3.put(readString, method);
            }
            return (C15820o2) method.invoke((Object) null, AnonymousClass000.A1b(A03));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw e2.getCause();
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    public abstract void A05(int i);

    public abstract boolean A09(int i);

    private Class A00(Class cls) {
        AnonymousClass008 r5 = this.A02;
        String name = cls.getName();
        Class cls2 = (Class) r5.get(name);
        if (cls2 != null) {
            return cls2;
        }
        String name2 = cls.getPackage().getName();
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = name2;
        A0M[1] = cls.getSimpleName();
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", A0M), false, cls.getClassLoader());
        r5.put(name, cls3);
        return cls3;
    }

    public void A08(C15820o2 r9) {
        if (r9 == null) {
            ((C03880Ig) this).A03.writeString((String) null);
            return;
        }
        try {
            Class<?> cls = r9.getClass();
            ((C03880Ig) this).A03.writeString(A00(cls).getName());
            C03880Ig A03 = A03();
            try {
                AnonymousClass008 r6 = this.A01;
                String name = cls.getName();
                Method method = (Method) r6.get(name);
                if (method == null) {
                    Class A002 = A00(cls);
                    System.currentTimeMillis();
                    method = A002.getDeclaredMethod("write", new Class[]{cls, AnonymousClass0XJ.class});
                    r6.put(name, method);
                }
                Object[] A0M = AnonymousClass001.A0M();
                A0M[0] = r9;
                A0M[1] = A03;
                method.invoke((Object) null, A0M);
                int i = A03.A00;
                if (i >= 0) {
                    int i2 = A03.A04.get(i);
                    Parcel parcel = A03.A03;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof RuntimeException) {
                    throw e2.getCause();
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
            }
        } catch (ClassNotFoundException e5) {
            StringBuilder A0u = AnonymousClass000.A0u();
            AnonymousClass000.A1C(r9, A0u);
            throw new RuntimeException(AnonymousClass000.A0q(" does not have a Parcelizer", A0u), e5);
        }
    }

    public AnonymousClass0XJ(AnonymousClass008 r1, AnonymousClass008 r2, AnonymousClass008 r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public int A01(int i, int i2) {
        if (A09(i2)) {
            return ((C03880Ig) this).A03.readInt();
        }
        return i;
    }

    public Parcelable A02(Parcelable parcelable, int i) {
        if (!A09(i)) {
            return parcelable;
        }
        C03880Ig r0 = (C03880Ig) this;
        return r0.A03.readParcelable(r0.getClass().getClassLoader());
    }

    public void A06(int i, int i2) {
        A05(i2);
        ((C03880Ig) this).A03.writeInt(i);
    }

    public void A07(Parcelable parcelable, int i) {
        A05(i);
        ((C03880Ig) this).A03.writeParcelable(parcelable, 0);
    }
}
