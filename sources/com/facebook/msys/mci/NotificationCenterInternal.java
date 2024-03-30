package com.facebook.msys.mci;

import X.AnonymousClass3NK;
import X.AnonymousClass88L;
import X.C192279Gj;
import X.C22873AxS;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public abstract class NotificationCenterInternal {
    public static final String TAG = "NotificationCenter";
    public final Set mMainConfig;
    public NativeHolder mNativeHolder;
    public final Map mNativeScopeToJavaScope;
    public final Map mObserverConfigs;

    public interface NotificationCallbackInternal {
        void onNewNotification(String str, C22873AxS axS, Map map);
    }

    private boolean scopeExistInAnyConfig(C22873AxS axS) {
        if (axS != null) {
            for (Map.Entry value : this.mObserverConfigs.entrySet()) {
                if (((AnonymousClass3NK) value.getValue()).A00.containsKey(axS)) {
                    return true;
                }
            }
        }
        return false;
    }

    public synchronized void addObserver(NotificationCallbackInternal notificationCallbackInternal, String str, int i, C22873AxS axS) {
        Objects.requireNonNull(notificationCallbackInternal);
        Objects.requireNonNull(str);
        if (!observerHasConfig(notificationCallbackInternal, str, axS)) {
            if (axS != null) {
                addScopeToMappingOfNativeToJava(axS);
            }
            addObserverConfig(notificationCallbackInternal, str, axS);
            if (this.mMainConfig.add(str)) {
                addObserverNative(str, i);
            }
        }
    }

    public abstract void addObserverNative(String str, int i);

    public void dispatchNotificationToCallbacks(String str, Long l, Object obj) {
        String str2;
        int i;
        Set set;
        Object obj2 = obj;
        if (obj == null || (obj instanceof Map)) {
            Map map = (Map) obj2;
            ArrayList arrayList = new ArrayList();
            C22873AxS axS = null;
            synchronized (this) {
                if (l != null) {
                    axS = (C22873AxS) this.mNativeScopeToJavaScope.get(l);
                }
                Iterator it = this.mObserverConfigs.entrySet().iterator();
                while (true) {
                    str2 = str;
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    AnonymousClass3NK r1 = (AnonymousClass3NK) entry.getValue();
                    if (r1.A01.contains(str) || ((set = (Set) r1.A00.get(axS)) != null && set.contains(str))) {
                        arrayList.add((NotificationCallbackInternal) entry.getKey());
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                AnonymousClass88L r3 = new AnonymousClass88L(axS, this, str2, arrayList, map);
                if (str.equals("MCDDatabaseCommitNotificationV2")) {
                    i = Execution.getExecutionContext();
                } else {
                    i = 1;
                }
                Execution.executePossiblySync(r3, i);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Native layer of msys reported a notification whose payload could not be serialized into a Java Map. Instead, it's of type ");
        sb.append(obj.getClass().getName());
        throw new RuntimeException(sb.toString());
    }

    public abstract NativeHolder initNativeHolder();

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r2.mNativeScopeToJavaScope.isEmpty() == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean isThereAnyPendingConfig() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.Set r0 = r2.mMainConfig     // Catch:{ all -> 0x001d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001a
            java.util.Map r0 = r2.mObserverConfigs     // Catch:{ all -> 0x001d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001a
            java.util.Map r0 = r2.mNativeScopeToJavaScope     // Catch:{ all -> 0x001d }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x001d }
            r0 = 0
            if (r1 != 0) goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            monitor-exit(r2)
            return r0
        L_0x001d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.NotificationCenterInternal.isThereAnyPendingConfig():boolean");
    }

    public synchronized void removeEveryObserver(NotificationCallbackInternal notificationCallbackInternal) {
        AnonymousClass3NK r5;
        Objects.requireNonNull(notificationCallbackInternal);
        AnonymousClass3NK r8 = (AnonymousClass3NK) this.mObserverConfigs.get(notificationCallbackInternal);
        if (r8 != null) {
            C192279Gj r6 = new C192279Gj(notificationCallbackInternal, this);
            synchronized (r8) {
                HashSet hashSet = new HashSet(r8.A01);
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : r8.A00.entrySet()) {
                    hashMap.put((C22873AxS) entry.getKey(), new HashSet((Collection) entry.getValue()));
                }
                r5 = new AnonymousClass3NK(hashMap, hashSet);
            }
            for (String removeObserver : r5.A01) {
                r6.A01.removeObserver(r6.A00, removeObserver, (C22873AxS) null);
            }
            for (Map.Entry entry2 : r5.A00.entrySet()) {
                C22873AxS axS = (C22873AxS) entry2.getKey();
                for (String removeObserver2 : (Set) entry2.getValue()) {
                    r6.A01.removeObserver(r6.A00, removeObserver2, axS);
                }
            }
            this.mObserverConfigs.remove(notificationCallbackInternal);
        }
    }

    public synchronized void removeObserver(NotificationCallbackInternal notificationCallbackInternal, String str, C22873AxS axS) {
        Objects.requireNonNull(notificationCallbackInternal);
        Objects.requireNonNull(str);
        if (observerHasConfig(notificationCallbackInternal, str, axS)) {
            removeObserverConfig(notificationCallbackInternal, str, axS);
            if (axS != null && !scopeExistInAnyConfig(axS)) {
                removeScopeFromNativeToJavaMappings(axS);
            }
            if (!notificationNameExistsInSomeObserver(str)) {
                this.mMainConfig.remove(str);
                removeObserverNative(str);
            }
        }
    }

    public abstract void removeObserverNative(String str);

    private boolean addObserverConfig(NotificationCallbackInternal notificationCallbackInternal, String str, C22873AxS axS) {
        Set set;
        AnonymousClass3NK r1 = (AnonymousClass3NK) this.mObserverConfigs.get(notificationCallbackInternal);
        if (r1 == null) {
            r1 = new AnonymousClass3NK();
            this.mObserverConfigs.put(notificationCallbackInternal, r1);
        }
        if (axS == null) {
            set = r1.A01;
        } else {
            Map map = r1.A00;
            set = (Set) map.get(axS);
            if (set == null) {
                set = new HashSet();
                map.put(axS, set);
            }
        }
        return set.add(str);
    }

    private void addScopeToMappingOfNativeToJava(C22873AxS axS) {
        this.mNativeScopeToJavaScope.put(Long.valueOf(axS.getNativeReference()), axS);
    }

    private boolean notificationNameExistsInSomeObserver(String str) {
        for (Map.Entry value : this.mObserverConfigs.entrySet()) {
            AnonymousClass3NK r1 = (AnonymousClass3NK) value.getValue();
            if (r1.A01.contains(str)) {
                return true;
            }
            Iterator it = r1.A00.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Set) ((Map.Entry) it.next()).getValue()).contains(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean observerHasConfig(NotificationCallbackInternal notificationCallbackInternal, String str, C22873AxS axS) {
        Set set;
        AnonymousClass3NK r0 = (AnonymousClass3NK) this.mObserverConfigs.get(notificationCallbackInternal);
        if (r0 == null) {
            return false;
        }
        if (axS == null) {
            set = r0.A01;
        } else {
            set = (Set) r0.A00.get(axS);
            if (set == null) {
                return false;
            }
        }
        return set.contains(str);
    }

    private boolean removeObserverConfig(NotificationCallbackInternal notificationCallbackInternal, String str, C22873AxS axS) {
        boolean z;
        AnonymousClass3NK r3 = (AnonymousClass3NK) this.mObserverConfigs.get(notificationCallbackInternal);
        if (r3 == null) {
            return false;
        }
        if (axS == null) {
            z = r3.A01.remove(str);
        } else {
            Map map = r3.A00;
            Set set = (Set) map.get(axS);
            if (set != null) {
                z = set.remove(str);
                if (set.isEmpty()) {
                    map.remove(axS);
                }
            } else {
                z = false;
            }
        }
        if (r3.A01.isEmpty() && r3.A00.isEmpty()) {
            this.mObserverConfigs.remove(notificationCallbackInternal);
        }
        return z;
    }

    private void removeScopeFromNativeToJavaMappings(C22873AxS axS) {
        this.mNativeScopeToJavaScope.remove(Long.valueOf(axS.getNativeReference()));
    }

    public NotificationCenterInternal(boolean z) {
        this.mNativeScopeToJavaScope = new HashMap();
        this.mObserverConfigs = new HashMap();
        this.mMainConfig = new HashSet();
        if (!z) {
            this.mNativeHolder = initNativeHolder();
        }
    }

    public void setNativeHolder(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public NotificationCenterInternal() {
        this(false);
    }
}
