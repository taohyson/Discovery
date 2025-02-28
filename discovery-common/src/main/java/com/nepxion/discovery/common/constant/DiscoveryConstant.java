package com.nepxion.discovery.common.constant;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

public class DiscoveryConstant {
    public static final String DISCOVERY_VERSION = "6.0.0-RC1";

    public static final String SPRING_APPLICATION_DISCOVERY_PLUGIN = "spring.application.discovery.plugin";
    public static final String SPRING_APPLICATION_DISCOVERY_VERSION = "spring.application.discovery.version";
    public static final String SPRING_APPLICATION_REGISTER_CONTROL_ENABLED = "spring.application.register.control.enabled";
    public static final String SPRING_APPLICATION_DISCOVERY_CONTROL_ENABLED = "spring.application.discovery.control.enabled";
    public static final String SPRING_APPLICATION_CONFIG_REST_CONTROL_ENABLED = "spring.application.config.rest.control.enabled";
    public static final String SPRING_APPLICATION_SERVLET_WEB_SERVER_ENABLED = "spring.application.servlet.web.server.enabled";
    public static final String SPRING_APPLICATION_REACTIVE_WEB_SERVER_ENABLED = "spring.application.reactive.web.server.enabled";
    public static final String SPRING_APPLICATION_CONFIG_FORMAT = "spring.application.config.format";
    public static final String SPRING_APPLICATION_CONFIG_PATH = "spring.application.config.path";
    public static final String SPRING_APPLICATION_GROUP_KEY = "spring.application.group.key";
    public static final String SPRING_APPLICATION_CONTEXT_PATH = "spring.application.context-path";
    public static final String SPRING_APPLICATION_DEFAULT_PROPERTIES_PATH = "spring.application.default.properties.path";
    public static final String SPRING_APPLICATION_DEFAULT_PROPERTIES_PATH_VALUE = "spring-application-default";
    public static final String SPRING_APPLICATION_NO_SERVERS_RETRY_ENABLED = "spring.application.no.servers.retry.enabled";
    public static final String SPRING_APPLICATION_NO_SERVERS_RETRY_TIMES = "spring.application.no.servers.retry.times";
    public static final String SPRING_APPLICATION_NO_SERVERS_RETRY_AWAIT_TIME = "spring.application.no.servers.retry.await.time";
    public static final String SPRING_APPLICATION_NO_SERVERS_NOTIFY_ENABLED = "spring.application.no.servers.notify.enabled";
    public static final String SPRING_APPLICATION_ENVIRONMENT_ISOLATION_ENABLED = "spring.application.environment.isolation.enabled";
    public static final String SPRING_APPLICATION_ENVIRONMENT_ROUTE_ENABLED = "spring.application.environment.route.enabled";
    public static final String SPRING_APPLICATION_ENVIRONMENT_ROUTE = "spring.application.environment.route";
    public static final String SPRING_APPLICATION_ENVIRONMENT_ROUTE_VALUE = "common";

    public static final String CONTEXT_PATH = "server.servlet.context-path";

    public static final String ANNOTATION_CONFIG_SERVLET_WEB_SERVER_APPLICATION_CONTEXT = "AnnotationConfigServletWebServerApplicationContext";
    public static final String ANNOTATION_CONFIG_REACTIVE_WEB_SERVER_APPLICATION_CONTEXT = "AnnotationConfigReactiveWebServerApplicationContext";

    public static final String SPRING_APPLICATION_GROUP_GENERATOR_ENABLED = "spring.application.group.generator.enabled";
    public static final String SPRING_APPLICATION_GROUP_GENERATOR_LENGTH = "spring.application.group.generator.length";

    public static final String SPRING_APPLICATION_GIT_GENERATOR_ENABLED = "spring.application.git.generator.enabled";
    public static final String SPRING_APPLICATION_GIT_GENERATOR_PATH = "spring.application.git.generator.path";
    public static final String SPRING_APPLICATION_GIT_VERSION_KEY = "spring.application.git.version.key";
    public static final String GIT = "git";
    public static final String GIT_COMMIT_ID = "git.commit.id";
    public static final String GIT_COMMIT_ID_ABBREV = "git.commit.id.abbrev";
    public static final String GIT_COMMIT_TIME = "git.commit.time";
    public static final String GIT_BUILD_VERSION = "git.build.version";

    public static final String SPRING_APPLICATION_NAME = "spring.application.name";
    public static final String SPRING_APPLICATION_TYPE = "spring.application.type";
    public static final String GROUP = "group";
    public static final String SERVICE_ID = "serviceId";
    public static final String HOST = "host";
    public static final String PORT = "port";
    public static final String METADATA = "metadata";

    public static final String SERVICE_TYPE = "service";
    public static final String GATEWAY_TYPE = "gateway";

    public static final String DYNAMIC_VERSION = "dynamicVersion";
    public static final String RULE = "rule";
    public static final String DYNAMIC_RULE = "dynamicRule";
    public static final String REACH_MAX_LIMITED_COUNT = "reach max limited count";
    public static final String REGISTER_ISOLATION = "register isolation";

    public static final String VERSION = "version";
    public static final String REGION = "region";
    public static final String ENVIRONMENT = "env";
    public static final String ADDRESS = "address";
    public static final String VERSION_WEIGHT = "version-weight";
    public static final String REGION_WEIGHT = "region-weight";

    public static final String N_D_PREFIX = "n-d-";
    public static final String N_D_SERVICE_PREFIX = "n-d-service";

    public static final String N_D_SERVICE_GROUP = "n-d-service-group";
    public static final String N_D_SERVICE_TYPE = "n-d-service-type";
    public static final String N_D_SERVICE_ID = "n-d-service-id";
    public static final String N_D_SERVICE_ADDRESS = "n-d-service-address";
    public static final String N_D_SERVICE_VERSION = "n-d-service-version";
    public static final String N_D_SERVICE_REGION = "n-d-service-region";
    public static final String N_D_SERVICE_ENVIRONMENT = "n-d-service-env";

    public static final String N_D_VERSION = "n-d-version";
    public static final String N_D_REGION = "n-d-region";
    public static final String N_D_ENVIRONMENT = "n-d-env";
    public static final String N_D_ADDRESS = "n-d-address";
    public static final String N_D_VERSION_WEIGHT = "n-d-version-weight";
    public static final String N_D_REGION_WEIGHT = "n-d-region-weight";

    public static final String TRACE_ID = "trace-id";
    public static final String SPAN_ID = "span-id";
    public static final String SPAN_VALUE = "GRAY";
    public static final String TAG_COMPONENT_VALUE = "gray";
    public static final String PLUGIN = "plugin";
    public static final String PLUGIN_VALUE = "Nepxion Discovery";

    public static final String CLASS = "class";
    public static final String METHOD = "method";
    public static final String EVENT = "event";
    public static final String ERROR_OBJECT = "error.object";

    public static final String XML_FORMAT = "xml";
    public static final String JSON_FORMAT = "json";
    public static final String PROPERTIES_FORMAT = "properties";
    public static final String PREFIX_CLASSPATH = "classpath:";
    public static final String PREFIX_FILE = "file:";

    public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";
    public static final String ENCODING_UTF_8 = "UTF-8";
    public static final String ENCODING_GBK = "GBK";
    public static final String ENCODING_ISO_8859_1 = "ISO-8859-1";
    public static final String SEPARATE = ";";
    public static final String EQUALS = "=";
    public static final String DASH = "-";

    public static final String ASYNC = "async";
    public static final String SYNC = "sync";
    public static final String GLOBAL = "global";
    public static final String PARTIAL = "partial";
    public static final String OK = "OK";
    public static final String NO = "NO";
    public static final String DEFAULT = "default";
    public static final String UNKNOWN = "unknown";

    public static final String EXPRESSION_PREFIX = "H";
    public static final String EXPRESSION_REGEX = "\\#" + EXPRESSION_PREFIX + "\\['\\S+'\\]";
    public static final String EXPRESSION_SUB_PREFIX = "#" + EXPRESSION_PREFIX + "['";
    public static final String EXPRESSION_SUB_SUFFIX = "']";

    public static final String DEFAULT_XML_RULE = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" +
            "<rule>\r\n" +
            "</rule>";
    public static final String DEFAULT_JSON_RULE = "{}";
}