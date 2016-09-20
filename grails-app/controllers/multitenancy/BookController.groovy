package multitenancy

import grails.converters.JSON
import grails.gorm.multitenancy.Tenants


class BookController {

    def index() {
        def books = Tenants.withCurrent {
            log.debug("User tenant: $it")
            Book.list()
        }
        render books as JSON
    }
}
