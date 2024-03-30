package X;

import com.facebook.wearable.datax.RemoteChannel;

/* renamed from: X.Ann  reason: case insensitive filesystem */
public final class C22505Ann extends AnonymousClass00R implements C006302t {
    public static final C22505Ann A00 = new C22505Ann();

    public C22505Ann() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        RemoteChannel remoteChannel = (RemoteChannel) obj;
        StringBuilder A0i = C36341k9.A0i(remoteChannel);
        A0i.append("Channel ");
        A0i.append(remoteChannel.getId());
        AnonymousClass6YR.A06("LinkSetup", AnonymousClass000.A0q(" connected", A0i));
        return AnonymousClass0AJ.A00;
    }
}
