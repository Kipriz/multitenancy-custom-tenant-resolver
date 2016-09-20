import multitenancy.CustomTenantResolver
import org.grails.datastore.mapping.multitenancy.TenantResolver

// Place your Spring DSL code here
beans = {
    tenantResolver(CustomTenantResolver)
}
