package X;

import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;

/* renamed from: X.8fE  reason: invalid class name and case insensitive filesystem */
public class C178178fE extends C21914Ack {
    public final Socket A00;
    public final boolean A01;

    public void bind(SocketAddress socketAddress) {
        throw C90524aI.A0X("Underlying tls13 is already connected.");
    }

    public void connect(SocketAddress socketAddress, int i) {
        throw C90524aI.A0X("Underlying tls13 is already connected.");
    }

    public InetAddress getInetAddress() {
        return this.A00.getInetAddress();
    }

    public boolean getKeepAlive() {
        return this.A00.getKeepAlive();
    }

    public InetAddress getLocalAddress() {
        return this.A00.getLocalAddress();
    }

    public int getLocalPort() {
        return this.A00.getLocalPort();
    }

    public SocketAddress getLocalSocketAddress() {
        return this.A00.getLocalSocketAddress();
    }

    public boolean getOOBInline() {
        return this.A00.getOOBInline();
    }

    public int getPort() {
        return this.A00.getPort();
    }

    public int getReceiveBufferSize() {
        return this.A00.getReceiveBufferSize();
    }

    public SocketAddress getRemoteSocketAddress() {
        return this.A00.getRemoteSocketAddress();
    }

    public boolean getReuseAddress() {
        return this.A00.getReuseAddress();
    }

    public int getSendBufferSize() {
        return this.A00.getSendBufferSize();
    }

    public int getSoLinger() {
        return this.A00.getSoLinger();
    }

    public int getSoTimeout() {
        return this.A00.getSoTimeout();
    }

    public boolean getTcpNoDelay() {
        return this.A00.getTcpNoDelay();
    }

    public int getTrafficClass() {
        return this.A00.getTrafficClass();
    }

    public boolean isBound() {
        return this.A00.isBound();
    }

    public boolean isClosed() {
        return this.A00.isClosed();
    }

    public boolean isConnected() {
        return this.A00.isConnected();
    }

    public boolean isInputShutdown() {
        return this.A00.isInputShutdown();
    }

    public boolean isOutputShutdown() {
        return this.A00.isOutputShutdown();
    }

    public void setKeepAlive(boolean z) {
        this.A00.setKeepAlive(z);
    }

    public void setReceiveBufferSize(int i) {
        this.A00.setReceiveBufferSize(i);
    }

    public void setReuseAddress(boolean z) {
        this.A00.setReuseAddress(z);
    }

    public void setSendBufferSize(int i) {
        this.A00.setSendBufferSize(i);
    }

    public void setSoLinger(boolean z, int i) {
        this.A00.setSoLinger(z, i);
    }

    public void setSoTimeout(int i) {
        this.A00.setSoTimeout(i);
    }

    public void setTcpNoDelay(boolean z) {
        this.A00.setTcpNoDelay(z);
    }

    public void setTrafficClass(int i) {
        this.A00.setTrafficClass(i);
    }

    public C178178fE(C21912Aci aci, String str, Socket socket, int i, boolean z) {
        if (socket.isConnected()) {
            this.A00 = socket;
            this.A00 = aci;
            this.A01 = z;
            this.A09 = str;
            this.A01 = i;
            A0A();
            return;
        }
        throw new SocketException("Socket is not connected.");
    }

    public void connect(SocketAddress socketAddress) {
        throw C90524aI.A0X("Underlying tls13 is already connected.");
    }
}
