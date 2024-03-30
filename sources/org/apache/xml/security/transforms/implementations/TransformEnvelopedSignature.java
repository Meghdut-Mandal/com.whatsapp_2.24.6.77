package org.apache.xml.security.transforms.implementations;

import org.apache.xml.security.signature.NodeFilter;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.transforms.Transform;
import org.apache.xml.security.transforms.TransformSpi;
import org.apache.xml.security.transforms.TransformationException;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Node;

public class TransformEnvelopedSignature extends TransformSpi {

    public class EnvelopedNodeFilter implements NodeFilter {
        public Node a;

        public EnvelopedNodeFilter(Node node) {
            this.a = node;
        }

        public int a(Node node) {
            Node node2 = this.a;
            return (node == node2 || XMLUtils.a(node2, node)) ? -1 : 1;
        }

        public int a(Node node, int i) {
            return node == this.a ? -1 : 1;
        }
    }

    public static Node a(Node node) {
        while (node != null && node.getNodeType() != 9) {
            if (node.getNamespaceURI().equals("http://www.w3.org/2000/09/xmldsig#") && node.getLocalName().equals("Signature")) {
                return node;
            }
            node = node.getParentNode();
        }
        throw new TransformationException("transform.envelopedSignatureTransformNotInSignatureElement");
    }

    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, Transform transform) {
        Node a = a(transform.k);
        xMLSignatureInput.e = a;
        xMLSignatureInput.a((NodeFilter) new EnvelopedNodeFilter(a));
        return xMLSignatureInput;
    }
}
