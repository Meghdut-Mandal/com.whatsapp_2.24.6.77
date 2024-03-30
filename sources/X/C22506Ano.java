package X;

import com.facebook.wearable.datax.RemoteChannel;

/* renamed from: X.Ano  reason: case insensitive filesystem */
public final class C22506Ano extends AnonymousClass00R implements C006302t {
    public static final C22506Ano A00 = new C22506Ano();

    public C22506Ano() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        RemoteChannel remoteChannel = (RemoteChannel) obj;
        StringBuilder A0i = C36341k9.A0i(remoteChannel);
        A0i.append("Channel ");
        A0i.append(remoteChannel.getId());
        AnonymousClass6YR.A06("LinkSetup", AnonymousClass000.A0q(" disconnected", A0i));
        return AnonymousClass0AJ.A00;
    }
}
