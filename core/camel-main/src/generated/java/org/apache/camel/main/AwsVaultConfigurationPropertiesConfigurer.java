/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.main;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.main.AwsVaultConfigurationProperties;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class AwsVaultConfigurationPropertiesConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.main.AwsVaultConfigurationProperties target = (org.apache.camel.main.AwsVaultConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "AccessKey": target.setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "awsvaultconfiguration":
        case "AwsVaultConfiguration": target.setAwsVaultConfiguration(property(camelContext, org.apache.camel.vault.AwsVaultConfiguration.class, value)); return true;
        case "azurevaultconfiguration":
        case "AzureVaultConfiguration": target.setAzureVaultConfiguration(property(camelContext, org.apache.camel.vault.AzureVaultConfiguration.class, value)); return true;
        case "defaultcredentialsprovider":
        case "DefaultCredentialsProvider": target.setDefaultCredentialsProvider(property(camelContext, boolean.class, value)); return true;
        case "gcpvaultconfiguration":
        case "GcpVaultConfiguration": target.setGcpVaultConfiguration(property(camelContext, org.apache.camel.vault.GcpVaultConfiguration.class, value)); return true;
        case "hashicorpvaultconfiguration":
        case "HashicorpVaultConfiguration": target.setHashicorpVaultConfiguration(property(camelContext, org.apache.camel.vault.HashicorpVaultConfiguration.class, value)); return true;
        case "profilecredentialsprovider":
        case "ProfileCredentialsProvider": target.setProfileCredentialsProvider(property(camelContext, boolean.class, value)); return true;
        case "profilename":
        case "ProfileName": target.setProfileName(property(camelContext, java.lang.String.class, value)); return true;
        case "refreshenabled":
        case "RefreshEnabled": target.setRefreshEnabled(property(camelContext, boolean.class, value)); return true;
        case "refreshperiod":
        case "RefreshPeriod": target.setRefreshPeriod(property(camelContext, long.class, value)); return true;
        case "region":
        case "Region": target.setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey":
        case "SecretKey": target.setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "secrets":
        case "Secrets": target.setSecrets(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "AccessKey": return java.lang.String.class;
        case "awsvaultconfiguration":
        case "AwsVaultConfiguration": return org.apache.camel.vault.AwsVaultConfiguration.class;
        case "azurevaultconfiguration":
        case "AzureVaultConfiguration": return org.apache.camel.vault.AzureVaultConfiguration.class;
        case "defaultcredentialsprovider":
        case "DefaultCredentialsProvider": return boolean.class;
        case "gcpvaultconfiguration":
        case "GcpVaultConfiguration": return org.apache.camel.vault.GcpVaultConfiguration.class;
        case "hashicorpvaultconfiguration":
        case "HashicorpVaultConfiguration": return org.apache.camel.vault.HashicorpVaultConfiguration.class;
        case "profilecredentialsprovider":
        case "ProfileCredentialsProvider": return boolean.class;
        case "profilename":
        case "ProfileName": return java.lang.String.class;
        case "refreshenabled":
        case "RefreshEnabled": return boolean.class;
        case "refreshperiod":
        case "RefreshPeriod": return long.class;
        case "region":
        case "Region": return java.lang.String.class;
        case "secretkey":
        case "SecretKey": return java.lang.String.class;
        case "secrets":
        case "Secrets": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.main.AwsVaultConfigurationProperties target = (org.apache.camel.main.AwsVaultConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "AccessKey": return target.getAccessKey();
        case "awsvaultconfiguration":
        case "AwsVaultConfiguration": return target.getAwsVaultConfiguration();
        case "azurevaultconfiguration":
        case "AzureVaultConfiguration": return target.getAzureVaultConfiguration();
        case "defaultcredentialsprovider":
        case "DefaultCredentialsProvider": return target.isDefaultCredentialsProvider();
        case "gcpvaultconfiguration":
        case "GcpVaultConfiguration": return target.getGcpVaultConfiguration();
        case "hashicorpvaultconfiguration":
        case "HashicorpVaultConfiguration": return target.getHashicorpVaultConfiguration();
        case "profilecredentialsprovider":
        case "ProfileCredentialsProvider": return target.isProfileCredentialsProvider();
        case "profilename":
        case "ProfileName": return target.getProfileName();
        case "refreshenabled":
        case "RefreshEnabled": return target.isRefreshEnabled();
        case "refreshperiod":
        case "RefreshPeriod": return target.getRefreshPeriod();
        case "region":
        case "Region": return target.getRegion();
        case "secretkey":
        case "SecretKey": return target.getSecretKey();
        case "secrets":
        case "Secrets": return target.getSecrets();
        default: return null;
        }
    }
}

