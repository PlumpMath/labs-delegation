package org.openengsb.labs.delegation.service.internal;

import java.net.URL;
import java.util.Collection;
import java.util.Collections;

import org.openengsb.labs.delegation.service.ResourceProvider;
import org.osgi.framework.Bundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResourceProviderImpl implements ResourceProvider {

    private static final Logger LOGGER = LoggerFactory.getLogger(ResourceProviderImpl.class);

    private Bundle bundle;

    public ResourceProviderImpl(Bundle bundle) {
        this.bundle = bundle;
    }

    @Override
    public URL loadResource(String name) {
        LOGGER.debug("loading ressource {} by delegation", name);
        return bundle.getResource(name);
    }

    @Override
    public Collection<URL> listResources() {
        // TODO Auto-generated method stub
        return Collections.emptySet();
    }

}