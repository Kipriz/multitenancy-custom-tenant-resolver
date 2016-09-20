package multitenancy

import groovy.util.logging.Slf4j
import org.grails.datastore.mapping.multitenancy.TenantResolver
import org.grails.datastore.mapping.multitenancy.exceptions.TenantNotFoundException

import javax.annotation.PostConstruct


@Slf4j
class CustomTenantResolver implements TenantResolver {
    @PostConstruct
    void init() {
        log.debug("PostConstruct CustomTenantResolver")
    }

    @Override
    Serializable resolveTenantIdentifier() throws TenantNotFoundException {
        log.debug("Resolve to moreBooks")
        return "moreBooks"
    }
}
