/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.as2;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.as2.AS2ServerManagerEndpointConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class AS2ServerManagerEndpointConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("ApiName", org.apache.camel.component.as2.internal.AS2ApiName.class);
        map.put("As2From", java.lang.String.class);
        map.put("As2MessageStructure", org.apache.camel.component.as2.api.AS2MessageStructure.class);
        map.put("As2To", java.lang.String.class);
        map.put("As2Version", java.lang.String.class);
        map.put("AttachedFileName", java.lang.String.class);
        map.put("ClientFqdn", java.lang.String.class);
        map.put("CompressionAlgorithm", org.apache.camel.component.as2.api.AS2CompressionAlgorithm.class);
        map.put("DecryptingPrivateKey", java.security.PrivateKey.class);
        map.put("DispositionNotificationTo", java.lang.String.class);
        map.put("EdiMessageTransferEncoding", java.lang.String.class);
        map.put("EdiMessageType", org.apache.http.entity.ContentType.class);
        map.put("EncryptingAlgorithm", org.apache.camel.component.as2.api.AS2EncryptionAlgorithm.class);
        map.put("EncryptingCertificateChain", java.security.cert.Certificate[].class);
        map.put("From", java.lang.String.class);
        map.put("HostnameVerifier", javax.net.ssl.HostnameVerifier.class);
        map.put("HttpConnectionPoolSize", java.lang.Integer.class);
        map.put("HttpConnectionPoolTtl", java.time.Duration.class);
        map.put("HttpConnectionTimeout", java.time.Duration.class);
        map.put("HttpSocketTimeout", java.time.Duration.class);
        map.put("MdnMessageTemplate", java.lang.String.class);
        map.put("MethodName", java.lang.String.class);
        map.put("RequestUri", java.lang.String.class);
        map.put("RequestUriPattern", java.lang.String.class);
        map.put("Server", java.lang.String.class);
        map.put("ServerFqdn", java.lang.String.class);
        map.put("ServerPortNumber", java.lang.Integer.class);
        map.put("SignedReceiptMicAlgorithms", java.lang.String[].class);
        map.put("SigningAlgorithm", org.apache.camel.component.as2.api.AS2SignatureAlgorithm.class);
        map.put("SigningCertificateChain", java.security.cert.Certificate[].class);
        map.put("SigningPrivateKey", java.security.PrivateKey.class);
        map.put("SslContext", javax.net.ssl.SSLContext.class);
        map.put("Subject", java.lang.String.class);
        map.put("TargetHostname", java.lang.String.class);
        map.put("TargetPortNumber", java.lang.Integer.class);
        map.put("UserAgent", java.lang.String.class);
        map.put("ValidateSigningCertificateChain", java.security.cert.Certificate[].class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.as2.AS2ServerManagerEndpointConfiguration target = (org.apache.camel.component.as2.AS2ServerManagerEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "ApiName": target.setApiName(property(camelContext, org.apache.camel.component.as2.internal.AS2ApiName.class, value)); return true;
        case "as2from":
        case "As2From": target.setAs2From(property(camelContext, java.lang.String.class, value)); return true;
        case "as2messagestructure":
        case "As2MessageStructure": target.setAs2MessageStructure(property(camelContext, org.apache.camel.component.as2.api.AS2MessageStructure.class, value)); return true;
        case "as2to":
        case "As2To": target.setAs2To(property(camelContext, java.lang.String.class, value)); return true;
        case "as2version":
        case "As2Version": target.setAs2Version(property(camelContext, java.lang.String.class, value)); return true;
        case "attachedfilename":
        case "AttachedFileName": target.setAttachedFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "clientfqdn":
        case "ClientFqdn": target.setClientFqdn(property(camelContext, java.lang.String.class, value)); return true;
        case "compressionalgorithm":
        case "CompressionAlgorithm": target.setCompressionAlgorithm(property(camelContext, org.apache.camel.component.as2.api.AS2CompressionAlgorithm.class, value)); return true;
        case "decryptingprivatekey":
        case "DecryptingPrivateKey": target.setDecryptingPrivateKey(property(camelContext, java.security.PrivateKey.class, value)); return true;
        case "dispositionnotificationto":
        case "DispositionNotificationTo": target.setDispositionNotificationTo(property(camelContext, java.lang.String.class, value)); return true;
        case "edimessagetransferencoding":
        case "EdiMessageTransferEncoding": target.setEdiMessageTransferEncoding(property(camelContext, java.lang.String.class, value)); return true;
        case "edimessagetype":
        case "EdiMessageType": target.setEdiMessageType(property(camelContext, org.apache.http.entity.ContentType.class, value)); return true;
        case "encryptingalgorithm":
        case "EncryptingAlgorithm": target.setEncryptingAlgorithm(property(camelContext, org.apache.camel.component.as2.api.AS2EncryptionAlgorithm.class, value)); return true;
        case "encryptingcertificatechain":
        case "EncryptingCertificateChain": target.setEncryptingCertificateChain(property(camelContext, java.security.cert.Certificate[].class, value)); return true;
        case "from":
        case "From": target.setFrom(property(camelContext, java.lang.String.class, value)); return true;
        case "hostnameverifier":
        case "HostnameVerifier": target.setHostnameVerifier(property(camelContext, javax.net.ssl.HostnameVerifier.class, value)); return true;
        case "httpconnectionpoolsize":
        case "HttpConnectionPoolSize": target.setHttpConnectionPoolSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "httpconnectionpoolttl":
        case "HttpConnectionPoolTtl": target.setHttpConnectionPoolTtl(property(camelContext, java.time.Duration.class, value)); return true;
        case "httpconnectiontimeout":
        case "HttpConnectionTimeout": target.setHttpConnectionTimeout(property(camelContext, java.time.Duration.class, value)); return true;
        case "httpsockettimeout":
        case "HttpSocketTimeout": target.setHttpSocketTimeout(property(camelContext, java.time.Duration.class, value)); return true;
        case "mdnmessagetemplate":
        case "MdnMessageTemplate": target.setMdnMessageTemplate(property(camelContext, java.lang.String.class, value)); return true;
        case "methodname":
        case "MethodName": target.setMethodName(property(camelContext, java.lang.String.class, value)); return true;
        case "requesturi":
        case "RequestUri": target.setRequestUri(property(camelContext, java.lang.String.class, value)); return true;
        case "requesturipattern":
        case "RequestUriPattern": target.setRequestUriPattern(property(camelContext, java.lang.String.class, value)); return true;
        case "server":
        case "Server": target.setServer(property(camelContext, java.lang.String.class, value)); return true;
        case "serverfqdn":
        case "ServerFqdn": target.setServerFqdn(property(camelContext, java.lang.String.class, value)); return true;
        case "serverportnumber":
        case "ServerPortNumber": target.setServerPortNumber(property(camelContext, java.lang.Integer.class, value)); return true;
        case "signedreceiptmicalgorithms":
        case "SignedReceiptMicAlgorithms": target.setSignedReceiptMicAlgorithms(property(camelContext, java.lang.String[].class, value)); return true;
        case "signingalgorithm":
        case "SigningAlgorithm": target.setSigningAlgorithm(property(camelContext, org.apache.camel.component.as2.api.AS2SignatureAlgorithm.class, value)); return true;
        case "signingcertificatechain":
        case "SigningCertificateChain": target.setSigningCertificateChain(property(camelContext, java.security.cert.Certificate[].class, value)); return true;
        case "signingprivatekey":
        case "SigningPrivateKey": target.setSigningPrivateKey(property(camelContext, java.security.PrivateKey.class, value)); return true;
        case "sslcontext":
        case "SslContext": target.setSslContext(property(camelContext, javax.net.ssl.SSLContext.class, value)); return true;
        case "subject":
        case "Subject": target.setSubject(property(camelContext, java.lang.String.class, value)); return true;
        case "targethostname":
        case "TargetHostname": target.setTargetHostname(property(camelContext, java.lang.String.class, value)); return true;
        case "targetportnumber":
        case "TargetPortNumber": target.setTargetPortNumber(property(camelContext, java.lang.Integer.class, value)); return true;
        case "useragent":
        case "UserAgent": target.setUserAgent(property(camelContext, java.lang.String.class, value)); return true;
        case "validatesigningcertificatechain":
        case "ValidateSigningCertificateChain": target.setValidateSigningCertificateChain(property(camelContext, java.security.cert.Certificate[].class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "ApiName": return org.apache.camel.component.as2.internal.AS2ApiName.class;
        case "as2from":
        case "As2From": return java.lang.String.class;
        case "as2messagestructure":
        case "As2MessageStructure": return org.apache.camel.component.as2.api.AS2MessageStructure.class;
        case "as2to":
        case "As2To": return java.lang.String.class;
        case "as2version":
        case "As2Version": return java.lang.String.class;
        case "attachedfilename":
        case "AttachedFileName": return java.lang.String.class;
        case "clientfqdn":
        case "ClientFqdn": return java.lang.String.class;
        case "compressionalgorithm":
        case "CompressionAlgorithm": return org.apache.camel.component.as2.api.AS2CompressionAlgorithm.class;
        case "decryptingprivatekey":
        case "DecryptingPrivateKey": return java.security.PrivateKey.class;
        case "dispositionnotificationto":
        case "DispositionNotificationTo": return java.lang.String.class;
        case "edimessagetransferencoding":
        case "EdiMessageTransferEncoding": return java.lang.String.class;
        case "edimessagetype":
        case "EdiMessageType": return org.apache.http.entity.ContentType.class;
        case "encryptingalgorithm":
        case "EncryptingAlgorithm": return org.apache.camel.component.as2.api.AS2EncryptionAlgorithm.class;
        case "encryptingcertificatechain":
        case "EncryptingCertificateChain": return java.security.cert.Certificate[].class;
        case "from":
        case "From": return java.lang.String.class;
        case "hostnameverifier":
        case "HostnameVerifier": return javax.net.ssl.HostnameVerifier.class;
        case "httpconnectionpoolsize":
        case "HttpConnectionPoolSize": return java.lang.Integer.class;
        case "httpconnectionpoolttl":
        case "HttpConnectionPoolTtl": return java.time.Duration.class;
        case "httpconnectiontimeout":
        case "HttpConnectionTimeout": return java.time.Duration.class;
        case "httpsockettimeout":
        case "HttpSocketTimeout": return java.time.Duration.class;
        case "mdnmessagetemplate":
        case "MdnMessageTemplate": return java.lang.String.class;
        case "methodname":
        case "MethodName": return java.lang.String.class;
        case "requesturi":
        case "RequestUri": return java.lang.String.class;
        case "requesturipattern":
        case "RequestUriPattern": return java.lang.String.class;
        case "server":
        case "Server": return java.lang.String.class;
        case "serverfqdn":
        case "ServerFqdn": return java.lang.String.class;
        case "serverportnumber":
        case "ServerPortNumber": return java.lang.Integer.class;
        case "signedreceiptmicalgorithms":
        case "SignedReceiptMicAlgorithms": return java.lang.String[].class;
        case "signingalgorithm":
        case "SigningAlgorithm": return org.apache.camel.component.as2.api.AS2SignatureAlgorithm.class;
        case "signingcertificatechain":
        case "SigningCertificateChain": return java.security.cert.Certificate[].class;
        case "signingprivatekey":
        case "SigningPrivateKey": return java.security.PrivateKey.class;
        case "sslcontext":
        case "SslContext": return javax.net.ssl.SSLContext.class;
        case "subject":
        case "Subject": return java.lang.String.class;
        case "targethostname":
        case "TargetHostname": return java.lang.String.class;
        case "targetportnumber":
        case "TargetPortNumber": return java.lang.Integer.class;
        case "useragent":
        case "UserAgent": return java.lang.String.class;
        case "validatesigningcertificatechain":
        case "ValidateSigningCertificateChain": return java.security.cert.Certificate[].class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.as2.AS2ServerManagerEndpointConfiguration target = (org.apache.camel.component.as2.AS2ServerManagerEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "ApiName": return target.getApiName();
        case "as2from":
        case "As2From": return target.getAs2From();
        case "as2messagestructure":
        case "As2MessageStructure": return target.getAs2MessageStructure();
        case "as2to":
        case "As2To": return target.getAs2To();
        case "as2version":
        case "As2Version": return target.getAs2Version();
        case "attachedfilename":
        case "AttachedFileName": return target.getAttachedFileName();
        case "clientfqdn":
        case "ClientFqdn": return target.getClientFqdn();
        case "compressionalgorithm":
        case "CompressionAlgorithm": return target.getCompressionAlgorithm();
        case "decryptingprivatekey":
        case "DecryptingPrivateKey": return target.getDecryptingPrivateKey();
        case "dispositionnotificationto":
        case "DispositionNotificationTo": return target.getDispositionNotificationTo();
        case "edimessagetransferencoding":
        case "EdiMessageTransferEncoding": return target.getEdiMessageTransferEncoding();
        case "edimessagetype":
        case "EdiMessageType": return target.getEdiMessageType();
        case "encryptingalgorithm":
        case "EncryptingAlgorithm": return target.getEncryptingAlgorithm();
        case "encryptingcertificatechain":
        case "EncryptingCertificateChain": return target.getEncryptingCertificateChain();
        case "from":
        case "From": return target.getFrom();
        case "hostnameverifier":
        case "HostnameVerifier": return target.getHostnameVerifier();
        case "httpconnectionpoolsize":
        case "HttpConnectionPoolSize": return target.getHttpConnectionPoolSize();
        case "httpconnectionpoolttl":
        case "HttpConnectionPoolTtl": return target.getHttpConnectionPoolTtl();
        case "httpconnectiontimeout":
        case "HttpConnectionTimeout": return target.getHttpConnectionTimeout();
        case "httpsockettimeout":
        case "HttpSocketTimeout": return target.getHttpSocketTimeout();
        case "mdnmessagetemplate":
        case "MdnMessageTemplate": return target.getMdnMessageTemplate();
        case "methodname":
        case "MethodName": return target.getMethodName();
        case "requesturi":
        case "RequestUri": return target.getRequestUri();
        case "requesturipattern":
        case "RequestUriPattern": return target.getRequestUriPattern();
        case "server":
        case "Server": return target.getServer();
        case "serverfqdn":
        case "ServerFqdn": return target.getServerFqdn();
        case "serverportnumber":
        case "ServerPortNumber": return target.getServerPortNumber();
        case "signedreceiptmicalgorithms":
        case "SignedReceiptMicAlgorithms": return target.getSignedReceiptMicAlgorithms();
        case "signingalgorithm":
        case "SigningAlgorithm": return target.getSigningAlgorithm();
        case "signingcertificatechain":
        case "SigningCertificateChain": return target.getSigningCertificateChain();
        case "signingprivatekey":
        case "SigningPrivateKey": return target.getSigningPrivateKey();
        case "sslcontext":
        case "SslContext": return target.getSslContext();
        case "subject":
        case "Subject": return target.getSubject();
        case "targethostname":
        case "TargetHostname": return target.getTargetHostname();
        case "targetportnumber":
        case "TargetPortNumber": return target.getTargetPortNumber();
        case "useragent":
        case "UserAgent": return target.getUserAgent();
        case "validatesigningcertificatechain":
        case "ValidateSigningCertificateChain": return target.getValidateSigningCertificateChain();
        default: return null;
        }
    }
}

