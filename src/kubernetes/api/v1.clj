(ns kubernetes.api.v1
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn connect-delete-namespaced-pod-proxy-with-http-info
  "connect DELETE requests to proxy of Pod"
  ([namespace name ] (connect-delete-namespaced-pod-proxy-with-http-info namespace name nil))
  ([namespace name {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy" :delete
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-delete-namespaced-pod-proxy
  "connect DELETE requests to proxy of Pod"
  ([namespace name ] (connect-delete-namespaced-pod-proxy namespace name nil))
  ([namespace name optional-params]
   (:data (connect-delete-namespaced-pod-proxy-with-http-info namespace name optional-params))))

(defn connect-delete-namespaced-pod-proxy-with-path-with-http-info
  "connect DELETE requests to proxy of Pod"
  ([namespace name path2 ] (connect-delete-namespaced-pod-proxy-with-path-with-http-info namespace name path2 nil))
  ([namespace name path2 {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy/{path}" :delete
             {:path-params   {"namespace" namespace "name" name "path" path2 }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-delete-namespaced-pod-proxy-with-path
  "connect DELETE requests to proxy of Pod"
  ([namespace name path2 ] (connect-delete-namespaced-pod-proxy-with-path namespace name path2 nil))
  ([namespace name path2 optional-params]
   (:data (connect-delete-namespaced-pod-proxy-with-path-with-http-info namespace name path2 optional-params))))

(defn connect-delete-namespaced-service-proxy-with-http-info
  "connect DELETE requests to proxy of Service"
  ([namespace name ] (connect-delete-namespaced-service-proxy-with-http-info namespace name nil))
  ([namespace name {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy" :delete
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-delete-namespaced-service-proxy
  "connect DELETE requests to proxy of Service"
  ([namespace name ] (connect-delete-namespaced-service-proxy namespace name nil))
  ([namespace name optional-params]
   (:data (connect-delete-namespaced-service-proxy-with-http-info namespace name optional-params))))

(defn connect-delete-namespaced-service-proxy-with-path-with-http-info
  "connect DELETE requests to proxy of Service"
  ([namespace name path2 ] (connect-delete-namespaced-service-proxy-with-path-with-http-info namespace name path2 nil))
  ([namespace name path2 {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy/{path}" :delete
             {:path-params   {"namespace" namespace "name" name "path" path2 }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-delete-namespaced-service-proxy-with-path
  "connect DELETE requests to proxy of Service"
  ([namespace name path2 ] (connect-delete-namespaced-service-proxy-with-path namespace name path2 nil))
  ([namespace name path2 optional-params]
   (:data (connect-delete-namespaced-service-proxy-with-path-with-http-info namespace name path2 optional-params))))

(defn connect-delete-node-proxy-with-http-info
  "connect DELETE requests to proxy of Node"
  ([name ] (connect-delete-node-proxy-with-http-info name nil))
  ([name {:keys [path ]}]
   (call-api "/api/v1/nodes/{name}/proxy" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-delete-node-proxy
  "connect DELETE requests to proxy of Node"
  ([name ] (connect-delete-node-proxy name nil))
  ([name optional-params]
   (:data (connect-delete-node-proxy-with-http-info name optional-params))))

(defn connect-delete-node-proxy-with-path-with-http-info
  "connect DELETE requests to proxy of Node"
  ([name path2 ] (connect-delete-node-proxy-with-path-with-http-info name path2 nil))
  ([name path2 {:keys [path ]}]
   (call-api "/api/v1/nodes/{name}/proxy/{path}" :delete
             {:path-params   {"name" name "path" path2 }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-delete-node-proxy-with-path
  "connect DELETE requests to proxy of Node"
  ([name path2 ] (connect-delete-node-proxy-with-path name path2 nil))
  ([name path2 optional-params]
   (:data (connect-delete-node-proxy-with-path-with-http-info name path2 optional-params))))

(defn connect-get-namespaced-pod-attach-with-http-info
  "connect GET requests to attach of Pod"
  ([namespace name ] (connect-get-namespaced-pod-attach-with-http-info namespace name nil))
  ([namespace name {:keys [stdin stdout stderr tty container ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/attach" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"stdin" stdin "stdout" stdout "stderr" stderr "tty" tty "container" container }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-get-namespaced-pod-attach
  "connect GET requests to attach of Pod"
  ([namespace name ] (connect-get-namespaced-pod-attach namespace name nil))
  ([namespace name optional-params]
   (:data (connect-get-namespaced-pod-attach-with-http-info namespace name optional-params))))

(defn connect-get-namespaced-pod-exec-with-http-info
  "connect GET requests to exec of Pod"
  ([namespace name ] (connect-get-namespaced-pod-exec-with-http-info namespace name nil))
  ([namespace name {:keys [stdin stdout stderr tty container command ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/exec" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"stdin" stdin "stdout" stdout "stderr" stderr "tty" tty "container" container "command" command }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-get-namespaced-pod-exec
  "connect GET requests to exec of Pod"
  ([namespace name ] (connect-get-namespaced-pod-exec namespace name nil))
  ([namespace name optional-params]
   (:data (connect-get-namespaced-pod-exec-with-http-info namespace name optional-params))))

(defn connect-get-namespaced-pod-portforward-with-http-info
  "connect GET requests to portforward of Pod"
  [namespace name ]
  (call-api "/api/v1/namespaces/{namespace}/pods/{name}/portforward" :get
            {:path-params   {"namespace" namespace "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn connect-get-namespaced-pod-portforward
  "connect GET requests to portforward of Pod"
  [namespace name ]
  (:data (connect-get-namespaced-pod-portforward-with-http-info namespace name)))

(defn connect-get-namespaced-pod-proxy-with-http-info
  "connect GET requests to proxy of Pod"
  ([namespace name ] (connect-get-namespaced-pod-proxy-with-http-info namespace name nil))
  ([namespace name {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-get-namespaced-pod-proxy
  "connect GET requests to proxy of Pod"
  ([namespace name ] (connect-get-namespaced-pod-proxy namespace name nil))
  ([namespace name optional-params]
   (:data (connect-get-namespaced-pod-proxy-with-http-info namespace name optional-params))))

(defn connect-get-namespaced-pod-proxy-with-path-with-http-info
  "connect GET requests to proxy of Pod"
  ([namespace name path2 ] (connect-get-namespaced-pod-proxy-with-path-with-http-info namespace name path2 nil))
  ([namespace name path2 {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy/{path}" :get
             {:path-params   {"namespace" namespace "name" name "path" path2 }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-get-namespaced-pod-proxy-with-path
  "connect GET requests to proxy of Pod"
  ([namespace name path2 ] (connect-get-namespaced-pod-proxy-with-path namespace name path2 nil))
  ([namespace name path2 optional-params]
   (:data (connect-get-namespaced-pod-proxy-with-path-with-http-info namespace name path2 optional-params))))

(defn connect-get-namespaced-service-proxy-with-http-info
  "connect GET requests to proxy of Service"
  ([namespace name ] (connect-get-namespaced-service-proxy-with-http-info namespace name nil))
  ([namespace name {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-get-namespaced-service-proxy
  "connect GET requests to proxy of Service"
  ([namespace name ] (connect-get-namespaced-service-proxy namespace name nil))
  ([namespace name optional-params]
   (:data (connect-get-namespaced-service-proxy-with-http-info namespace name optional-params))))

(defn connect-get-namespaced-service-proxy-with-path-with-http-info
  "connect GET requests to proxy of Service"
  ([namespace name path2 ] (connect-get-namespaced-service-proxy-with-path-with-http-info namespace name path2 nil))
  ([namespace name path2 {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy/{path}" :get
             {:path-params   {"namespace" namespace "name" name "path" path2 }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-get-namespaced-service-proxy-with-path
  "connect GET requests to proxy of Service"
  ([namespace name path2 ] (connect-get-namespaced-service-proxy-with-path namespace name path2 nil))
  ([namespace name path2 optional-params]
   (:data (connect-get-namespaced-service-proxy-with-path-with-http-info namespace name path2 optional-params))))

(defn connect-get-node-proxy-with-http-info
  "connect GET requests to proxy of Node"
  ([name ] (connect-get-node-proxy-with-http-info name nil))
  ([name {:keys [path ]}]
   (call-api "/api/v1/nodes/{name}/proxy" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-get-node-proxy
  "connect GET requests to proxy of Node"
  ([name ] (connect-get-node-proxy name nil))
  ([name optional-params]
   (:data (connect-get-node-proxy-with-http-info name optional-params))))

(defn connect-get-node-proxy-with-path-with-http-info
  "connect GET requests to proxy of Node"
  ([name path2 ] (connect-get-node-proxy-with-path-with-http-info name path2 nil))
  ([name path2 {:keys [path ]}]
   (call-api "/api/v1/nodes/{name}/proxy/{path}" :get
             {:path-params   {"name" name "path" path2 }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-get-node-proxy-with-path
  "connect GET requests to proxy of Node"
  ([name path2 ] (connect-get-node-proxy-with-path name path2 nil))
  ([name path2 optional-params]
   (:data (connect-get-node-proxy-with-path-with-http-info name path2 optional-params))))

(defn connect-head-namespaced-pod-proxy-with-http-info
  "connect HEAD requests to proxy of Pod"
  ([namespace name ] (connect-head-namespaced-pod-proxy-with-http-info namespace name nil))
  ([namespace name {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy" :head
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-head-namespaced-pod-proxy
  "connect HEAD requests to proxy of Pod"
  ([namespace name ] (connect-head-namespaced-pod-proxy namespace name nil))
  ([namespace name optional-params]
   (:data (connect-head-namespaced-pod-proxy-with-http-info namespace name optional-params))))

(defn connect-head-namespaced-pod-proxy-with-path-with-http-info
  "connect HEAD requests to proxy of Pod"
  ([namespace name path2 ] (connect-head-namespaced-pod-proxy-with-path-with-http-info namespace name path2 nil))
  ([namespace name path2 {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy/{path}" :head
             {:path-params   {"namespace" namespace "name" name "path" path2 }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-head-namespaced-pod-proxy-with-path
  "connect HEAD requests to proxy of Pod"
  ([namespace name path2 ] (connect-head-namespaced-pod-proxy-with-path namespace name path2 nil))
  ([namespace name path2 optional-params]
   (:data (connect-head-namespaced-pod-proxy-with-path-with-http-info namespace name path2 optional-params))))

(defn connect-head-namespaced-service-proxy-with-http-info
  "connect HEAD requests to proxy of Service"
  ([namespace name ] (connect-head-namespaced-service-proxy-with-http-info namespace name nil))
  ([namespace name {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy" :head
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-head-namespaced-service-proxy
  "connect HEAD requests to proxy of Service"
  ([namespace name ] (connect-head-namespaced-service-proxy namespace name nil))
  ([namespace name optional-params]
   (:data (connect-head-namespaced-service-proxy-with-http-info namespace name optional-params))))

(defn connect-head-namespaced-service-proxy-with-path-with-http-info
  "connect HEAD requests to proxy of Service"
  ([namespace name path2 ] (connect-head-namespaced-service-proxy-with-path-with-http-info namespace name path2 nil))
  ([namespace name path2 {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy/{path}" :head
             {:path-params   {"namespace" namespace "name" name "path" path2 }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-head-namespaced-service-proxy-with-path
  "connect HEAD requests to proxy of Service"
  ([namespace name path2 ] (connect-head-namespaced-service-proxy-with-path namespace name path2 nil))
  ([namespace name path2 optional-params]
   (:data (connect-head-namespaced-service-proxy-with-path-with-http-info namespace name path2 optional-params))))

(defn connect-head-node-proxy-with-http-info
  "connect HEAD requests to proxy of Node"
  ([name ] (connect-head-node-proxy-with-http-info name nil))
  ([name {:keys [path ]}]
   (call-api "/api/v1/nodes/{name}/proxy" :head
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-head-node-proxy
  "connect HEAD requests to proxy of Node"
  ([name ] (connect-head-node-proxy name nil))
  ([name optional-params]
   (:data (connect-head-node-proxy-with-http-info name optional-params))))

(defn connect-head-node-proxy-with-path-with-http-info
  "connect HEAD requests to proxy of Node"
  ([name path2 ] (connect-head-node-proxy-with-path-with-http-info name path2 nil))
  ([name path2 {:keys [path ]}]
   (call-api "/api/v1/nodes/{name}/proxy/{path}" :head
             {:path-params   {"name" name "path" path2 }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-head-node-proxy-with-path
  "connect HEAD requests to proxy of Node"
  ([name path2 ] (connect-head-node-proxy-with-path name path2 nil))
  ([name path2 optional-params]
   (:data (connect-head-node-proxy-with-path-with-http-info name path2 optional-params))))

(defn connect-options-namespaced-pod-proxy-with-http-info
  "connect OPTIONS requests to proxy of Pod"
  ([namespace name ] (connect-options-namespaced-pod-proxy-with-http-info namespace name nil))
  ([namespace name {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy" :options
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-options-namespaced-pod-proxy
  "connect OPTIONS requests to proxy of Pod"
  ([namespace name ] (connect-options-namespaced-pod-proxy namespace name nil))
  ([namespace name optional-params]
   (:data (connect-options-namespaced-pod-proxy-with-http-info namespace name optional-params))))

(defn connect-options-namespaced-pod-proxy-with-path-with-http-info
  "connect OPTIONS requests to proxy of Pod"
  ([namespace name path2 ] (connect-options-namespaced-pod-proxy-with-path-with-http-info namespace name path2 nil))
  ([namespace name path2 {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy/{path}" :options
             {:path-params   {"namespace" namespace "name" name "path" path2 }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-options-namespaced-pod-proxy-with-path
  "connect OPTIONS requests to proxy of Pod"
  ([namespace name path2 ] (connect-options-namespaced-pod-proxy-with-path namespace name path2 nil))
  ([namespace name path2 optional-params]
   (:data (connect-options-namespaced-pod-proxy-with-path-with-http-info namespace name path2 optional-params))))

(defn connect-options-namespaced-service-proxy-with-http-info
  "connect OPTIONS requests to proxy of Service"
  ([namespace name ] (connect-options-namespaced-service-proxy-with-http-info namespace name nil))
  ([namespace name {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy" :options
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-options-namespaced-service-proxy
  "connect OPTIONS requests to proxy of Service"
  ([namespace name ] (connect-options-namespaced-service-proxy namespace name nil))
  ([namespace name optional-params]
   (:data (connect-options-namespaced-service-proxy-with-http-info namespace name optional-params))))

(defn connect-options-namespaced-service-proxy-with-path-with-http-info
  "connect OPTIONS requests to proxy of Service"
  ([namespace name path2 ] (connect-options-namespaced-service-proxy-with-path-with-http-info namespace name path2 nil))
  ([namespace name path2 {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy/{path}" :options
             {:path-params   {"namespace" namespace "name" name "path" path2 }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-options-namespaced-service-proxy-with-path
  "connect OPTIONS requests to proxy of Service"
  ([namespace name path2 ] (connect-options-namespaced-service-proxy-with-path namespace name path2 nil))
  ([namespace name path2 optional-params]
   (:data (connect-options-namespaced-service-proxy-with-path-with-http-info namespace name path2 optional-params))))

(defn connect-options-node-proxy-with-http-info
  "connect OPTIONS requests to proxy of Node"
  ([name ] (connect-options-node-proxy-with-http-info name nil))
  ([name {:keys [path ]}]
   (call-api "/api/v1/nodes/{name}/proxy" :options
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-options-node-proxy
  "connect OPTIONS requests to proxy of Node"
  ([name ] (connect-options-node-proxy name nil))
  ([name optional-params]
   (:data (connect-options-node-proxy-with-http-info name optional-params))))

(defn connect-options-node-proxy-with-path-with-http-info
  "connect OPTIONS requests to proxy of Node"
  ([name path2 ] (connect-options-node-proxy-with-path-with-http-info name path2 nil))
  ([name path2 {:keys [path ]}]
   (call-api "/api/v1/nodes/{name}/proxy/{path}" :options
             {:path-params   {"name" name "path" path2 }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-options-node-proxy-with-path
  "connect OPTIONS requests to proxy of Node"
  ([name path2 ] (connect-options-node-proxy-with-path name path2 nil))
  ([name path2 optional-params]
   (:data (connect-options-node-proxy-with-path-with-http-info name path2 optional-params))))

(defn connect-post-namespaced-pod-attach-with-http-info
  "connect POST requests to attach of Pod"
  ([namespace name ] (connect-post-namespaced-pod-attach-with-http-info namespace name nil))
  ([namespace name {:keys [stdin stdout stderr tty container ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/attach" :post
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"stdin" stdin "stdout" stdout "stderr" stderr "tty" tty "container" container }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-post-namespaced-pod-attach
  "connect POST requests to attach of Pod"
  ([namespace name ] (connect-post-namespaced-pod-attach namespace name nil))
  ([namespace name optional-params]
   (:data (connect-post-namespaced-pod-attach-with-http-info namespace name optional-params))))

(defn connect-post-namespaced-pod-exec-with-http-info
  "connect POST requests to exec of Pod"
  ([namespace name ] (connect-post-namespaced-pod-exec-with-http-info namespace name nil))
  ([namespace name {:keys [stdin stdout stderr tty container command ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/exec" :post
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"stdin" stdin "stdout" stdout "stderr" stderr "tty" tty "container" container "command" command }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-post-namespaced-pod-exec
  "connect POST requests to exec of Pod"
  ([namespace name ] (connect-post-namespaced-pod-exec namespace name nil))
  ([namespace name optional-params]
   (:data (connect-post-namespaced-pod-exec-with-http-info namespace name optional-params))))

(defn connect-post-namespaced-pod-portforward-with-http-info
  "connect POST requests to portforward of Pod"
  [namespace name ]
  (call-api "/api/v1/namespaces/{namespace}/pods/{name}/portforward" :post
            {:path-params   {"namespace" namespace "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn connect-post-namespaced-pod-portforward
  "connect POST requests to portforward of Pod"
  [namespace name ]
  (:data (connect-post-namespaced-pod-portforward-with-http-info namespace name)))

(defn connect-post-namespaced-pod-proxy-with-http-info
  "connect POST requests to proxy of Pod"
  ([namespace name ] (connect-post-namespaced-pod-proxy-with-http-info namespace name nil))
  ([namespace name {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy" :post
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-post-namespaced-pod-proxy
  "connect POST requests to proxy of Pod"
  ([namespace name ] (connect-post-namespaced-pod-proxy namespace name nil))
  ([namespace name optional-params]
   (:data (connect-post-namespaced-pod-proxy-with-http-info namespace name optional-params))))

(defn connect-post-namespaced-pod-proxy-with-path-with-http-info
  "connect POST requests to proxy of Pod"
  ([namespace name path2 ] (connect-post-namespaced-pod-proxy-with-path-with-http-info namespace name path2 nil))
  ([namespace name path2 {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy/{path}" :post
             {:path-params   {"namespace" namespace "name" name "path" path2 }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-post-namespaced-pod-proxy-with-path
  "connect POST requests to proxy of Pod"
  ([namespace name path2 ] (connect-post-namespaced-pod-proxy-with-path namespace name path2 nil))
  ([namespace name path2 optional-params]
   (:data (connect-post-namespaced-pod-proxy-with-path-with-http-info namespace name path2 optional-params))))

(defn connect-post-namespaced-service-proxy-with-http-info
  "connect POST requests to proxy of Service"
  ([namespace name ] (connect-post-namespaced-service-proxy-with-http-info namespace name nil))
  ([namespace name {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy" :post
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-post-namespaced-service-proxy
  "connect POST requests to proxy of Service"
  ([namespace name ] (connect-post-namespaced-service-proxy namespace name nil))
  ([namespace name optional-params]
   (:data (connect-post-namespaced-service-proxy-with-http-info namespace name optional-params))))

(defn connect-post-namespaced-service-proxy-with-path-with-http-info
  "connect POST requests to proxy of Service"
  ([namespace name path2 ] (connect-post-namespaced-service-proxy-with-path-with-http-info namespace name path2 nil))
  ([namespace name path2 {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy/{path}" :post
             {:path-params   {"namespace" namespace "name" name "path" path2 }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-post-namespaced-service-proxy-with-path
  "connect POST requests to proxy of Service"
  ([namespace name path2 ] (connect-post-namespaced-service-proxy-with-path namespace name path2 nil))
  ([namespace name path2 optional-params]
   (:data (connect-post-namespaced-service-proxy-with-path-with-http-info namespace name path2 optional-params))))

(defn connect-post-node-proxy-with-http-info
  "connect POST requests to proxy of Node"
  ([name ] (connect-post-node-proxy-with-http-info name nil))
  ([name {:keys [path ]}]
   (call-api "/api/v1/nodes/{name}/proxy" :post
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-post-node-proxy
  "connect POST requests to proxy of Node"
  ([name ] (connect-post-node-proxy name nil))
  ([name optional-params]
   (:data (connect-post-node-proxy-with-http-info name optional-params))))

(defn connect-post-node-proxy-with-path-with-http-info
  "connect POST requests to proxy of Node"
  ([name path2 ] (connect-post-node-proxy-with-path-with-http-info name path2 nil))
  ([name path2 {:keys [path ]}]
   (call-api "/api/v1/nodes/{name}/proxy/{path}" :post
             {:path-params   {"name" name "path" path2 }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-post-node-proxy-with-path
  "connect POST requests to proxy of Node"
  ([name path2 ] (connect-post-node-proxy-with-path name path2 nil))
  ([name path2 optional-params]
   (:data (connect-post-node-proxy-with-path-with-http-info name path2 optional-params))))

(defn connect-put-namespaced-pod-proxy-with-http-info
  "connect PUT requests to proxy of Pod"
  ([namespace name ] (connect-put-namespaced-pod-proxy-with-http-info namespace name nil))
  ([namespace name {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy" :put
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-put-namespaced-pod-proxy
  "connect PUT requests to proxy of Pod"
  ([namespace name ] (connect-put-namespaced-pod-proxy namespace name nil))
  ([namespace name optional-params]
   (:data (connect-put-namespaced-pod-proxy-with-http-info namespace name optional-params))))

(defn connect-put-namespaced-pod-proxy-with-path-with-http-info
  "connect PUT requests to proxy of Pod"
  ([namespace name path2 ] (connect-put-namespaced-pod-proxy-with-path-with-http-info namespace name path2 nil))
  ([namespace name path2 {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy/{path}" :put
             {:path-params   {"namespace" namespace "name" name "path" path2 }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-put-namespaced-pod-proxy-with-path
  "connect PUT requests to proxy of Pod"
  ([namespace name path2 ] (connect-put-namespaced-pod-proxy-with-path namespace name path2 nil))
  ([namespace name path2 optional-params]
   (:data (connect-put-namespaced-pod-proxy-with-path-with-http-info namespace name path2 optional-params))))

(defn connect-put-namespaced-service-proxy-with-http-info
  "connect PUT requests to proxy of Service"
  ([namespace name ] (connect-put-namespaced-service-proxy-with-http-info namespace name nil))
  ([namespace name {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy" :put
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-put-namespaced-service-proxy
  "connect PUT requests to proxy of Service"
  ([namespace name ] (connect-put-namespaced-service-proxy namespace name nil))
  ([namespace name optional-params]
   (:data (connect-put-namespaced-service-proxy-with-http-info namespace name optional-params))))

(defn connect-put-namespaced-service-proxy-with-path-with-http-info
  "connect PUT requests to proxy of Service"
  ([namespace name path2 ] (connect-put-namespaced-service-proxy-with-path-with-http-info namespace name path2 nil))
  ([namespace name path2 {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy/{path}" :put
             {:path-params   {"namespace" namespace "name" name "path" path2 }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-put-namespaced-service-proxy-with-path
  "connect PUT requests to proxy of Service"
  ([namespace name path2 ] (connect-put-namespaced-service-proxy-with-path namespace name path2 nil))
  ([namespace name path2 optional-params]
   (:data (connect-put-namespaced-service-proxy-with-path-with-http-info namespace name path2 optional-params))))

(defn connect-put-node-proxy-with-http-info
  "connect PUT requests to proxy of Node"
  ([name ] (connect-put-node-proxy-with-http-info name nil))
  ([name {:keys [path ]}]
   (call-api "/api/v1/nodes/{name}/proxy" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-put-node-proxy
  "connect PUT requests to proxy of Node"
  ([name ] (connect-put-node-proxy name nil))
  ([name optional-params]
   (:data (connect-put-node-proxy-with-http-info name optional-params))))

(defn connect-put-node-proxy-with-path-with-http-info
  "connect PUT requests to proxy of Node"
  ([name path2 ] (connect-put-node-proxy-with-path-with-http-info name path2 nil))
  ([name path2 {:keys [path ]}]
   (call-api "/api/v1/nodes/{name}/proxy/{path}" :put
             {:path-params   {"name" name "path" path2 }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn connect-put-node-proxy-with-path
  "connect PUT requests to proxy of Node"
  ([name path2 ] (connect-put-node-proxy-with-path name path2 nil))
  ([name path2 optional-params]
   (:data (connect-put-node-proxy-with-path-with-http-info name path2 optional-params))))

(defn create-namespace-with-http-info
  "create a Namespace"
  ([body ] (create-namespace-with-http-info body nil))
  ([body {:keys [pretty ]}]
   (call-api "/api/v1/namespaces" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn create-namespace
  "create a Namespace"
  ([body ] (create-namespace body nil))
  ([body optional-params]
   (:data (create-namespace-with-http-info body optional-params))))

(defn create-namespaced-binding-with-http-info
  "create a Binding"
  ([body namespace ] (create-namespaced-binding-with-http-info body namespace nil))
  ([body namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/bindings" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn create-namespaced-binding
  "create a Binding"
  ([body namespace ] (create-namespaced-binding body namespace nil))
  ([body namespace optional-params]
   (:data (create-namespaced-binding-with-http-info body namespace optional-params))))

(defn create-namespaced-binding-binding-with-http-info
  "create binding of a Binding"
  ([body namespace name ] (create-namespaced-binding-binding-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/binding" :post
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn create-namespaced-binding-binding
  "create binding of a Binding"
  ([body namespace name ] (create-namespaced-binding-binding body namespace name nil))
  ([body namespace name optional-params]
   (:data (create-namespaced-binding-binding-with-http-info body namespace name optional-params))))

(defn create-namespaced-config-map-with-http-info
  "create a ConfigMap"
  ([body namespace ] (create-namespaced-config-map-with-http-info body namespace nil))
  ([body namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/configmaps" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn create-namespaced-config-map
  "create a ConfigMap"
  ([body namespace ] (create-namespaced-config-map body namespace nil))
  ([body namespace optional-params]
   (:data (create-namespaced-config-map-with-http-info body namespace optional-params))))

(defn create-namespaced-endpoints-with-http-info
  "create Endpoints"
  ([body namespace ] (create-namespaced-endpoints-with-http-info body namespace nil))
  ([body namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/endpoints" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn create-namespaced-endpoints
  "create Endpoints"
  ([body namespace ] (create-namespaced-endpoints body namespace nil))
  ([body namespace optional-params]
   (:data (create-namespaced-endpoints-with-http-info body namespace optional-params))))

(defn create-namespaced-event-with-http-info
  "create an Event"
  ([body namespace ] (create-namespaced-event-with-http-info body namespace nil))
  ([body namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/events" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn create-namespaced-event
  "create an Event"
  ([body namespace ] (create-namespaced-event body namespace nil))
  ([body namespace optional-params]
   (:data (create-namespaced-event-with-http-info body namespace optional-params))))

(defn create-namespaced-eviction-eviction-with-http-info
  "create eviction of an Eviction"
  ([body namespace name ] (create-namespaced-eviction-eviction-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/eviction" :post
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn create-namespaced-eviction-eviction
  "create eviction of an Eviction"
  ([body namespace name ] (create-namespaced-eviction-eviction body namespace name nil))
  ([body namespace name optional-params]
   (:data (create-namespaced-eviction-eviction-with-http-info body namespace name optional-params))))

(defn create-namespaced-limit-range-with-http-info
  "create a LimitRange"
  ([body namespace ] (create-namespaced-limit-range-with-http-info body namespace nil))
  ([body namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/limitranges" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn create-namespaced-limit-range
  "create a LimitRange"
  ([body namespace ] (create-namespaced-limit-range body namespace nil))
  ([body namespace optional-params]
   (:data (create-namespaced-limit-range-with-http-info body namespace optional-params))))

(defn create-namespaced-persistent-volume-claim-with-http-info
  "create a PersistentVolumeClaim"
  ([body namespace ] (create-namespaced-persistent-volume-claim-with-http-info body namespace nil))
  ([body namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/persistentvolumeclaims" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn create-namespaced-persistent-volume-claim
  "create a PersistentVolumeClaim"
  ([body namespace ] (create-namespaced-persistent-volume-claim body namespace nil))
  ([body namespace optional-params]
   (:data (create-namespaced-persistent-volume-claim-with-http-info body namespace optional-params))))

(defn create-namespaced-pod-with-http-info
  "create a Pod"
  ([body namespace ] (create-namespaced-pod-with-http-info body namespace nil))
  ([body namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn create-namespaced-pod
  "create a Pod"
  ([body namespace ] (create-namespaced-pod body namespace nil))
  ([body namespace optional-params]
   (:data (create-namespaced-pod-with-http-info body namespace optional-params))))

(defn create-namespaced-pod-template-with-http-info
  "create a PodTemplate"
  ([body namespace ] (create-namespaced-pod-template-with-http-info body namespace nil))
  ([body namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/podtemplates" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn create-namespaced-pod-template
  "create a PodTemplate"
  ([body namespace ] (create-namespaced-pod-template body namespace nil))
  ([body namespace optional-params]
   (:data (create-namespaced-pod-template-with-http-info body namespace optional-params))))

(defn create-namespaced-replication-controller-with-http-info
  "create a ReplicationController"
  ([body namespace ] (create-namespaced-replication-controller-with-http-info body namespace nil))
  ([body namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn create-namespaced-replication-controller
  "create a ReplicationController"
  ([body namespace ] (create-namespaced-replication-controller body namespace nil))
  ([body namespace optional-params]
   (:data (create-namespaced-replication-controller-with-http-info body namespace optional-params))))

(defn create-namespaced-resource-quota-with-http-info
  "create a ResourceQuota"
  ([body namespace ] (create-namespaced-resource-quota-with-http-info body namespace nil))
  ([body namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/resourcequotas" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn create-namespaced-resource-quota
  "create a ResourceQuota"
  ([body namespace ] (create-namespaced-resource-quota body namespace nil))
  ([body namespace optional-params]
   (:data (create-namespaced-resource-quota-with-http-info body namespace optional-params))))

(defn create-namespaced-secret-with-http-info
  "create a Secret"
  ([body namespace ] (create-namespaced-secret-with-http-info body namespace nil))
  ([body namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/secrets" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn create-namespaced-secret
  "create a Secret"
  ([body namespace ] (create-namespaced-secret body namespace nil))
  ([body namespace optional-params]
   (:data (create-namespaced-secret-with-http-info body namespace optional-params))))

(defn create-namespaced-service-with-http-info
  "create a Service"
  ([body namespace ] (create-namespaced-service-with-http-info body namespace nil))
  ([body namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/services" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn create-namespaced-service
  "create a Service"
  ([body namespace ] (create-namespaced-service body namespace nil))
  ([body namespace optional-params]
   (:data (create-namespaced-service-with-http-info body namespace optional-params))))

(defn create-namespaced-service-account-with-http-info
  "create a ServiceAccount"
  ([body namespace ] (create-namespaced-service-account-with-http-info body namespace nil))
  ([body namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/serviceaccounts" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn create-namespaced-service-account
  "create a ServiceAccount"
  ([body namespace ] (create-namespaced-service-account body namespace nil))
  ([body namespace optional-params]
   (:data (create-namespaced-service-account-with-http-info body namespace optional-params))))

(defn create-node-with-http-info
  "create a Node"
  ([body ] (create-node-with-http-info body nil))
  ([body {:keys [pretty ]}]
   (call-api "/api/v1/nodes" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn create-node
  "create a Node"
  ([body ] (create-node body nil))
  ([body optional-params]
   (:data (create-node-with-http-info body optional-params))))

(defn create-persistent-volume-with-http-info
  "create a PersistentVolume"
  ([body ] (create-persistent-volume-with-http-info body nil))
  ([body {:keys [pretty ]}]
   (call-api "/api/v1/persistentvolumes" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn create-persistent-volume
  "create a PersistentVolume"
  ([body ] (create-persistent-volume body nil))
  ([body optional-params]
   (:data (create-persistent-volume-with-http-info body optional-params))))

(defn delete-namespace-with-http-info
  "delete a Namespace"
  ([body name ] (delete-namespace-with-http-info body name nil))
  ([body name {:keys [pretty grace-period-seconds orphan-dependents ]}]
   (call-api "/api/v1/namespaces/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn delete-namespace
  "delete a Namespace"
  ([body name ] (delete-namespace body name nil))
  ([body name optional-params]
   (:data (delete-namespace-with-http-info body name optional-params))))

(defn delete-namespaced-config-map-with-http-info
  "delete a ConfigMap"
  ([body namespace name ] (delete-namespaced-config-map-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty grace-period-seconds orphan-dependents ]}]
   (call-api "/api/v1/namespaces/{namespace}/configmaps/{name}" :delete
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn delete-namespaced-config-map
  "delete a ConfigMap"
  ([body namespace name ] (delete-namespaced-config-map body namespace name nil))
  ([body namespace name optional-params]
   (:data (delete-namespaced-config-map-with-http-info body namespace name optional-params))))

(defn delete-namespaced-endpoints-with-http-info
  "delete Endpoints"
  ([body namespace name ] (delete-namespaced-endpoints-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty grace-period-seconds orphan-dependents ]}]
   (call-api "/api/v1/namespaces/{namespace}/endpoints/{name}" :delete
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn delete-namespaced-endpoints
  "delete Endpoints"
  ([body namespace name ] (delete-namespaced-endpoints body namespace name nil))
  ([body namespace name optional-params]
   (:data (delete-namespaced-endpoints-with-http-info body namespace name optional-params))))

(defn delete-namespaced-event-with-http-info
  "delete an Event"
  ([body namespace name ] (delete-namespaced-event-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty grace-period-seconds orphan-dependents ]}]
   (call-api "/api/v1/namespaces/{namespace}/events/{name}" :delete
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn delete-namespaced-event
  "delete an Event"
  ([body namespace name ] (delete-namespaced-event body namespace name nil))
  ([body namespace name optional-params]
   (:data (delete-namespaced-event-with-http-info body namespace name optional-params))))

(defn delete-namespaced-limit-range-with-http-info
  "delete a LimitRange"
  ([body namespace name ] (delete-namespaced-limit-range-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty grace-period-seconds orphan-dependents ]}]
   (call-api "/api/v1/namespaces/{namespace}/limitranges/{name}" :delete
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn delete-namespaced-limit-range
  "delete a LimitRange"
  ([body namespace name ] (delete-namespaced-limit-range body namespace name nil))
  ([body namespace name optional-params]
   (:data (delete-namespaced-limit-range-with-http-info body namespace name optional-params))))

(defn delete-namespaced-persistent-volume-claim-with-http-info
  "delete a PersistentVolumeClaim"
  ([body namespace name ] (delete-namespaced-persistent-volume-claim-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty grace-period-seconds orphan-dependents ]}]
   (call-api "/api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}" :delete
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn delete-namespaced-persistent-volume-claim
  "delete a PersistentVolumeClaim"
  ([body namespace name ] (delete-namespaced-persistent-volume-claim body namespace name nil))
  ([body namespace name optional-params]
   (:data (delete-namespaced-persistent-volume-claim-with-http-info body namespace name optional-params))))

(defn delete-namespaced-pod-with-http-info
  "delete a Pod"
  ([body namespace name ] (delete-namespaced-pod-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty grace-period-seconds orphan-dependents ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}" :delete
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn delete-namespaced-pod
  "delete a Pod"
  ([body namespace name ] (delete-namespaced-pod body namespace name nil))
  ([body namespace name optional-params]
   (:data (delete-namespaced-pod-with-http-info body namespace name optional-params))))

(defn delete-namespaced-pod-template-with-http-info
  "delete a PodTemplate"
  ([body namespace name ] (delete-namespaced-pod-template-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty grace-period-seconds orphan-dependents ]}]
   (call-api "/api/v1/namespaces/{namespace}/podtemplates/{name}" :delete
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn delete-namespaced-pod-template
  "delete a PodTemplate"
  ([body namespace name ] (delete-namespaced-pod-template body namespace name nil))
  ([body namespace name optional-params]
   (:data (delete-namespaced-pod-template-with-http-info body namespace name optional-params))))

(defn delete-namespaced-replication-controller-with-http-info
  "delete a ReplicationController"
  ([body namespace name ] (delete-namespaced-replication-controller-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty grace-period-seconds orphan-dependents ]}]
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers/{name}" :delete
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn delete-namespaced-replication-controller
  "delete a ReplicationController"
  ([body namespace name ] (delete-namespaced-replication-controller body namespace name nil))
  ([body namespace name optional-params]
   (:data (delete-namespaced-replication-controller-with-http-info body namespace name optional-params))))

(defn delete-namespaced-resource-quota-with-http-info
  "delete a ResourceQuota"
  ([body namespace name ] (delete-namespaced-resource-quota-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty grace-period-seconds orphan-dependents ]}]
   (call-api "/api/v1/namespaces/{namespace}/resourcequotas/{name}" :delete
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn delete-namespaced-resource-quota
  "delete a ResourceQuota"
  ([body namespace name ] (delete-namespaced-resource-quota body namespace name nil))
  ([body namespace name optional-params]
   (:data (delete-namespaced-resource-quota-with-http-info body namespace name optional-params))))

(defn delete-namespaced-secret-with-http-info
  "delete a Secret"
  ([body namespace name ] (delete-namespaced-secret-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty grace-period-seconds orphan-dependents ]}]
   (call-api "/api/v1/namespaces/{namespace}/secrets/{name}" :delete
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn delete-namespaced-secret
  "delete a Secret"
  ([body namespace name ] (delete-namespaced-secret body namespace name nil))
  ([body namespace name optional-params]
   (:data (delete-namespaced-secret-with-http-info body namespace name optional-params))))

(defn delete-namespaced-service-with-http-info
  "delete a Service"
  ([namespace name ] (delete-namespaced-service-with-http-info namespace name nil))
  ([namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}" :delete
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn delete-namespaced-service
  "delete a Service"
  ([namespace name ] (delete-namespaced-service namespace name nil))
  ([namespace name optional-params]
   (:data (delete-namespaced-service-with-http-info namespace name optional-params))))

(defn delete-namespaced-service-account-with-http-info
  "delete a ServiceAccount"
  ([body namespace name ] (delete-namespaced-service-account-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty grace-period-seconds orphan-dependents ]}]
   (call-api "/api/v1/namespaces/{namespace}/serviceaccounts/{name}" :delete
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn delete-namespaced-service-account
  "delete a ServiceAccount"
  ([body namespace name ] (delete-namespaced-service-account body namespace name nil))
  ([body namespace name optional-params]
   (:data (delete-namespaced-service-account-with-http-info body namespace name optional-params))))

(defn delete-node-with-http-info
  "delete a Node"
  ([body name ] (delete-node-with-http-info body name nil))
  ([body name {:keys [pretty grace-period-seconds orphan-dependents ]}]
   (call-api "/api/v1/nodes/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn delete-node
  "delete a Node"
  ([body name ] (delete-node body name nil))
  ([body name optional-params]
   (:data (delete-node-with-http-info body name optional-params))))

(defn delete-persistent-volume-with-http-info
  "delete a PersistentVolume"
  ([body name ] (delete-persistent-volume-with-http-info body name nil))
  ([body name {:keys [pretty grace-period-seconds orphan-dependents ]}]
   (call-api "/api/v1/persistentvolumes/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn delete-persistent-volume
  "delete a PersistentVolume"
  ([body name ] (delete-persistent-volume body name nil))
  ([body name optional-params]
   (:data (delete-persistent-volume-with-http-info body name optional-params))))

(defn deletecollection-namespace-with-http-info
  "delete collection of Namespace"
  ([] (deletecollection-namespace-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/namespaces" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn deletecollection-namespace
  "delete collection of Namespace"
  ([] (deletecollection-namespace nil))
  ([optional-params]
   (:data (deletecollection-namespace-with-http-info optional-params))))

(defn deletecollection-namespaced-config-map-with-http-info
  "delete collection of ConfigMap"
  ([namespace ] (deletecollection-namespaced-config-map-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/configmaps" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn deletecollection-namespaced-config-map
  "delete collection of ConfigMap"
  ([namespace ] (deletecollection-namespaced-config-map namespace nil))
  ([namespace optional-params]
   (:data (deletecollection-namespaced-config-map-with-http-info namespace optional-params))))

(defn deletecollection-namespaced-endpoints-with-http-info
  "delete collection of Endpoints"
  ([namespace ] (deletecollection-namespaced-endpoints-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/endpoints" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn deletecollection-namespaced-endpoints
  "delete collection of Endpoints"
  ([namespace ] (deletecollection-namespaced-endpoints namespace nil))
  ([namespace optional-params]
   (:data (deletecollection-namespaced-endpoints-with-http-info namespace optional-params))))

(defn deletecollection-namespaced-event-with-http-info
  "delete collection of Event"
  ([namespace ] (deletecollection-namespaced-event-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/events" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn deletecollection-namespaced-event
  "delete collection of Event"
  ([namespace ] (deletecollection-namespaced-event namespace nil))
  ([namespace optional-params]
   (:data (deletecollection-namespaced-event-with-http-info namespace optional-params))))

(defn deletecollection-namespaced-limit-range-with-http-info
  "delete collection of LimitRange"
  ([namespace ] (deletecollection-namespaced-limit-range-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/limitranges" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn deletecollection-namespaced-limit-range
  "delete collection of LimitRange"
  ([namespace ] (deletecollection-namespaced-limit-range namespace nil))
  ([namespace optional-params]
   (:data (deletecollection-namespaced-limit-range-with-http-info namespace optional-params))))

(defn deletecollection-namespaced-persistent-volume-claim-with-http-info
  "delete collection of PersistentVolumeClaim"
  ([namespace ] (deletecollection-namespaced-persistent-volume-claim-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/persistentvolumeclaims" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn deletecollection-namespaced-persistent-volume-claim
  "delete collection of PersistentVolumeClaim"
  ([namespace ] (deletecollection-namespaced-persistent-volume-claim namespace nil))
  ([namespace optional-params]
   (:data (deletecollection-namespaced-persistent-volume-claim-with-http-info namespace optional-params))))

(defn deletecollection-namespaced-pod-with-http-info
  "delete collection of Pod"
  ([namespace ] (deletecollection-namespaced-pod-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn deletecollection-namespaced-pod
  "delete collection of Pod"
  ([namespace ] (deletecollection-namespaced-pod namespace nil))
  ([namespace optional-params]
   (:data (deletecollection-namespaced-pod-with-http-info namespace optional-params))))

(defn deletecollection-namespaced-pod-template-with-http-info
  "delete collection of PodTemplate"
  ([namespace ] (deletecollection-namespaced-pod-template-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/podtemplates" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn deletecollection-namespaced-pod-template
  "delete collection of PodTemplate"
  ([namespace ] (deletecollection-namespaced-pod-template namespace nil))
  ([namespace optional-params]
   (:data (deletecollection-namespaced-pod-template-with-http-info namespace optional-params))))

(defn deletecollection-namespaced-replication-controller-with-http-info
  "delete collection of ReplicationController"
  ([namespace ] (deletecollection-namespaced-replication-controller-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn deletecollection-namespaced-replication-controller
  "delete collection of ReplicationController"
  ([namespace ] (deletecollection-namespaced-replication-controller namespace nil))
  ([namespace optional-params]
   (:data (deletecollection-namespaced-replication-controller-with-http-info namespace optional-params))))

(defn deletecollection-namespaced-resource-quota-with-http-info
  "delete collection of ResourceQuota"
  ([namespace ] (deletecollection-namespaced-resource-quota-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/resourcequotas" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn deletecollection-namespaced-resource-quota
  "delete collection of ResourceQuota"
  ([namespace ] (deletecollection-namespaced-resource-quota namespace nil))
  ([namespace optional-params]
   (:data (deletecollection-namespaced-resource-quota-with-http-info namespace optional-params))))

(defn deletecollection-namespaced-secret-with-http-info
  "delete collection of Secret"
  ([namespace ] (deletecollection-namespaced-secret-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/secrets" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn deletecollection-namespaced-secret
  "delete collection of Secret"
  ([namespace ] (deletecollection-namespaced-secret namespace nil))
  ([namespace optional-params]
   (:data (deletecollection-namespaced-secret-with-http-info namespace optional-params))))

(defn deletecollection-namespaced-service-account-with-http-info
  "delete collection of ServiceAccount"
  ([namespace ] (deletecollection-namespaced-service-account-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/serviceaccounts" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn deletecollection-namespaced-service-account
  "delete collection of ServiceAccount"
  ([namespace ] (deletecollection-namespaced-service-account namespace nil))
  ([namespace optional-params]
   (:data (deletecollection-namespaced-service-account-with-http-info namespace optional-params))))

(defn deletecollection-node-with-http-info
  "delete collection of Node"
  ([] (deletecollection-node-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/nodes" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn deletecollection-node
  "delete collection of Node"
  ([] (deletecollection-node nil))
  ([optional-params]
   (:data (deletecollection-node-with-http-info optional-params))))

(defn deletecollection-persistent-volume-with-http-info
  "delete collection of PersistentVolume"
  ([] (deletecollection-persistent-volume-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/persistentvolumes" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn deletecollection-persistent-volume
  "delete collection of PersistentVolume"
  ([] (deletecollection-persistent-volume nil))
  ([optional-params]
   (:data (deletecollection-persistent-volume-with-http-info optional-params))))

(defn get-api-resources-with-http-info
  "get available resources"
  []
  (call-api "/api/v1" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    []}))

(defn get-api-resources
  "get available resources"
  []
  (:data (get-api-resources-with-http-info)))

(defn list-component-status-with-http-info
  "list objects of kind ComponentStatus"
  ([] (list-component-status-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/componentstatuses" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn list-component-status
  "list objects of kind ComponentStatus"
  ([] (list-component-status nil))
  ([optional-params]
   (:data (list-component-status-with-http-info optional-params))))

(defn list-config-map-for-all-namespaces-with-http-info
  "list or watch objects of kind ConfigMap"
  ([] (list-config-map-for-all-namespaces-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/configmaps" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn list-config-map-for-all-namespaces
  "list or watch objects of kind ConfigMap"
  ([] (list-config-map-for-all-namespaces nil))
  ([optional-params]
   (:data (list-config-map-for-all-namespaces-with-http-info optional-params))))

(defn list-endpoints-for-all-namespaces-with-http-info
  "list or watch objects of kind Endpoints"
  ([] (list-endpoints-for-all-namespaces-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/endpoints" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn list-endpoints-for-all-namespaces
  "list or watch objects of kind Endpoints"
  ([] (list-endpoints-for-all-namespaces nil))
  ([optional-params]
   (:data (list-endpoints-for-all-namespaces-with-http-info optional-params))))

(defn list-event-for-all-namespaces-with-http-info
  "list or watch objects of kind Event"
  ([] (list-event-for-all-namespaces-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/events" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn list-event-for-all-namespaces
  "list or watch objects of kind Event"
  ([] (list-event-for-all-namespaces nil))
  ([optional-params]
   (:data (list-event-for-all-namespaces-with-http-info optional-params))))

(defn list-limit-range-for-all-namespaces-with-http-info
  "list or watch objects of kind LimitRange"
  ([] (list-limit-range-for-all-namespaces-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/limitranges" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn list-limit-range-for-all-namespaces
  "list or watch objects of kind LimitRange"
  ([] (list-limit-range-for-all-namespaces nil))
  ([optional-params]
   (:data (list-limit-range-for-all-namespaces-with-http-info optional-params))))

(defn list-namespace-with-http-info
  "list or watch objects of kind Namespace"
  ([] (list-namespace-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/namespaces" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn list-namespace
  "list or watch objects of kind Namespace"
  ([] (list-namespace nil))
  ([optional-params]
   (:data (list-namespace-with-http-info optional-params))))

(defn list-namespaced-config-map-with-http-info
  "list or watch objects of kind ConfigMap"
  ([namespace ] (list-namespaced-config-map-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/configmaps" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn list-namespaced-config-map
  "list or watch objects of kind ConfigMap"
  ([namespace ] (list-namespaced-config-map namespace nil))
  ([namespace optional-params]
   (:data (list-namespaced-config-map-with-http-info namespace optional-params))))

(defn list-namespaced-endpoints-with-http-info
  "list or watch objects of kind Endpoints"
  ([namespace ] (list-namespaced-endpoints-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/endpoints" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn list-namespaced-endpoints
  "list or watch objects of kind Endpoints"
  ([namespace ] (list-namespaced-endpoints namespace nil))
  ([namespace optional-params]
   (:data (list-namespaced-endpoints-with-http-info namespace optional-params))))

(defn list-namespaced-event-with-http-info
  "list or watch objects of kind Event"
  ([namespace ] (list-namespaced-event-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/events" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn list-namespaced-event
  "list or watch objects of kind Event"
  ([namespace ] (list-namespaced-event namespace nil))
  ([namespace optional-params]
   (:data (list-namespaced-event-with-http-info namespace optional-params))))

(defn list-namespaced-limit-range-with-http-info
  "list or watch objects of kind LimitRange"
  ([namespace ] (list-namespaced-limit-range-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/limitranges" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn list-namespaced-limit-range
  "list or watch objects of kind LimitRange"
  ([namespace ] (list-namespaced-limit-range namespace nil))
  ([namespace optional-params]
   (:data (list-namespaced-limit-range-with-http-info namespace optional-params))))

(defn list-namespaced-persistent-volume-claim-with-http-info
  "list or watch objects of kind PersistentVolumeClaim"
  ([namespace ] (list-namespaced-persistent-volume-claim-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/persistentvolumeclaims" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn list-namespaced-persistent-volume-claim
  "list or watch objects of kind PersistentVolumeClaim"
  ([namespace ] (list-namespaced-persistent-volume-claim namespace nil))
  ([namespace optional-params]
   (:data (list-namespaced-persistent-volume-claim-with-http-info namespace optional-params))))

(defn list-namespaced-pod-with-http-info
  "list or watch objects of kind Pod"
  ([namespace ] (list-namespaced-pod-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn list-namespaced-pod
  "list or watch objects of kind Pod"
  ([namespace ] (list-namespaced-pod namespace nil))
  ([namespace optional-params]
   (:data (list-namespaced-pod-with-http-info namespace optional-params))))

(defn list-namespaced-pod-template-with-http-info
  "list or watch objects of kind PodTemplate"
  ([namespace ] (list-namespaced-pod-template-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/podtemplates" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn list-namespaced-pod-template
  "list or watch objects of kind PodTemplate"
  ([namespace ] (list-namespaced-pod-template namespace nil))
  ([namespace optional-params]
   (:data (list-namespaced-pod-template-with-http-info namespace optional-params))))

(defn list-namespaced-replication-controller-with-http-info
  "list or watch objects of kind ReplicationController"
  ([namespace ] (list-namespaced-replication-controller-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn list-namespaced-replication-controller
  "list or watch objects of kind ReplicationController"
  ([namespace ] (list-namespaced-replication-controller namespace nil))
  ([namespace optional-params]
   (:data (list-namespaced-replication-controller-with-http-info namespace optional-params))))

(defn list-namespaced-resource-quota-with-http-info
  "list or watch objects of kind ResourceQuota"
  ([namespace ] (list-namespaced-resource-quota-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/resourcequotas" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn list-namespaced-resource-quota
  "list or watch objects of kind ResourceQuota"
  ([namespace ] (list-namespaced-resource-quota namespace nil))
  ([namespace optional-params]
   (:data (list-namespaced-resource-quota-with-http-info namespace optional-params))))

(defn list-namespaced-secret-with-http-info
  "list or watch objects of kind Secret"
  ([namespace ] (list-namespaced-secret-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/secrets" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn list-namespaced-secret
  "list or watch objects of kind Secret"
  ([namespace ] (list-namespaced-secret namespace nil))
  ([namespace optional-params]
   (:data (list-namespaced-secret-with-http-info namespace optional-params))))

(defn list-namespaced-service-with-http-info
  "list or watch objects of kind Service"
  ([namespace ] (list-namespaced-service-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/services" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn list-namespaced-service
  "list or watch objects of kind Service"
  ([namespace ] (list-namespaced-service namespace nil))
  ([namespace optional-params]
   (:data (list-namespaced-service-with-http-info namespace optional-params))))

(defn list-namespaced-service-account-with-http-info
  "list or watch objects of kind ServiceAccount"
  ([namespace ] (list-namespaced-service-account-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/serviceaccounts" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn list-namespaced-service-account
  "list or watch objects of kind ServiceAccount"
  ([namespace ] (list-namespaced-service-account namespace nil))
  ([namespace optional-params]
   (:data (list-namespaced-service-account-with-http-info namespace optional-params))))

(defn list-node-with-http-info
  "list or watch objects of kind Node"
  ([] (list-node-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/nodes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn list-node
  "list or watch objects of kind Node"
  ([] (list-node nil))
  ([optional-params]
   (:data (list-node-with-http-info optional-params))))

(defn list-persistent-volume-with-http-info
  "list or watch objects of kind PersistentVolume"
  ([] (list-persistent-volume-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/persistentvolumes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn list-persistent-volume
  "list or watch objects of kind PersistentVolume"
  ([] (list-persistent-volume nil))
  ([optional-params]
   (:data (list-persistent-volume-with-http-info optional-params))))

(defn list-persistent-volume-claim-for-all-namespaces-with-http-info
  "list or watch objects of kind PersistentVolumeClaim"
  ([] (list-persistent-volume-claim-for-all-namespaces-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/persistentvolumeclaims" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn list-persistent-volume-claim-for-all-namespaces
  "list or watch objects of kind PersistentVolumeClaim"
  ([] (list-persistent-volume-claim-for-all-namespaces nil))
  ([optional-params]
   (:data (list-persistent-volume-claim-for-all-namespaces-with-http-info optional-params))))

(defn list-pod-for-all-namespaces-with-http-info
  "list or watch objects of kind Pod"
  ([] (list-pod-for-all-namespaces-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/pods" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn list-pod-for-all-namespaces
  "list or watch objects of kind Pod"
  ([] (list-pod-for-all-namespaces nil))
  ([optional-params]
   (:data (list-pod-for-all-namespaces-with-http-info optional-params))))

(defn list-pod-template-for-all-namespaces-with-http-info
  "list or watch objects of kind PodTemplate"
  ([] (list-pod-template-for-all-namespaces-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/podtemplates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn list-pod-template-for-all-namespaces
  "list or watch objects of kind PodTemplate"
  ([] (list-pod-template-for-all-namespaces nil))
  ([optional-params]
   (:data (list-pod-template-for-all-namespaces-with-http-info optional-params))))

(defn list-replication-controller-for-all-namespaces-with-http-info
  "list or watch objects of kind ReplicationController"
  ([] (list-replication-controller-for-all-namespaces-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/replicationcontrollers" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn list-replication-controller-for-all-namespaces
  "list or watch objects of kind ReplicationController"
  ([] (list-replication-controller-for-all-namespaces nil))
  ([optional-params]
   (:data (list-replication-controller-for-all-namespaces-with-http-info optional-params))))

(defn list-resource-quota-for-all-namespaces-with-http-info
  "list or watch objects of kind ResourceQuota"
  ([] (list-resource-quota-for-all-namespaces-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/resourcequotas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn list-resource-quota-for-all-namespaces
  "list or watch objects of kind ResourceQuota"
  ([] (list-resource-quota-for-all-namespaces nil))
  ([optional-params]
   (:data (list-resource-quota-for-all-namespaces-with-http-info optional-params))))

(defn list-secret-for-all-namespaces-with-http-info
  "list or watch objects of kind Secret"
  ([] (list-secret-for-all-namespaces-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/secrets" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn list-secret-for-all-namespaces
  "list or watch objects of kind Secret"
  ([] (list-secret-for-all-namespaces nil))
  ([optional-params]
   (:data (list-secret-for-all-namespaces-with-http-info optional-params))))

(defn list-service-account-for-all-namespaces-with-http-info
  "list or watch objects of kind ServiceAccount"
  ([] (list-service-account-for-all-namespaces-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/serviceaccounts" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn list-service-account-for-all-namespaces
  "list or watch objects of kind ServiceAccount"
  ([] (list-service-account-for-all-namespaces nil))
  ([optional-params]
   (:data (list-service-account-for-all-namespaces-with-http-info optional-params))))

(defn list-service-for-all-namespaces-with-http-info
  "list or watch objects of kind Service"
  ([] (list-service-for-all-namespaces-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/services" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn list-service-for-all-namespaces
  "list or watch objects of kind Service"
  ([] (list-service-for-all-namespaces nil))
  ([optional-params]
   (:data (list-service-for-all-namespaces-with-http-info optional-params))))

(defn patch-namespace-with-http-info
  "partially update the specified Namespace"
  ([body name ] (patch-namespace-with-http-info body name nil))
  ([body name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn patch-namespace
  "partially update the specified Namespace"
  ([body name ] (patch-namespace body name nil))
  ([body name optional-params]
   (:data (patch-namespace-with-http-info body name optional-params))))

(defn patch-namespace-status-with-http-info
  "partially update status of the specified Namespace"
  ([body name ] (patch-namespace-status-with-http-info body name nil))
  ([body name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{name}/status" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn patch-namespace-status
  "partially update status of the specified Namespace"
  ([body name ] (patch-namespace-status body name nil))
  ([body name optional-params]
   (:data (patch-namespace-status-with-http-info body name optional-params))))

(defn patch-namespaced-config-map-with-http-info
  "partially update the specified ConfigMap"
  ([body namespace name ] (patch-namespaced-config-map-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/configmaps/{name}" :patch
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn patch-namespaced-config-map
  "partially update the specified ConfigMap"
  ([body namespace name ] (patch-namespaced-config-map body namespace name nil))
  ([body namespace name optional-params]
   (:data (patch-namespaced-config-map-with-http-info body namespace name optional-params))))

(defn patch-namespaced-endpoints-with-http-info
  "partially update the specified Endpoints"
  ([body namespace name ] (patch-namespaced-endpoints-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/endpoints/{name}" :patch
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn patch-namespaced-endpoints
  "partially update the specified Endpoints"
  ([body namespace name ] (patch-namespaced-endpoints body namespace name nil))
  ([body namespace name optional-params]
   (:data (patch-namespaced-endpoints-with-http-info body namespace name optional-params))))

(defn patch-namespaced-event-with-http-info
  "partially update the specified Event"
  ([body namespace name ] (patch-namespaced-event-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/events/{name}" :patch
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn patch-namespaced-event
  "partially update the specified Event"
  ([body namespace name ] (patch-namespaced-event body namespace name nil))
  ([body namespace name optional-params]
   (:data (patch-namespaced-event-with-http-info body namespace name optional-params))))

(defn patch-namespaced-limit-range-with-http-info
  "partially update the specified LimitRange"
  ([body namespace name ] (patch-namespaced-limit-range-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/limitranges/{name}" :patch
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn patch-namespaced-limit-range
  "partially update the specified LimitRange"
  ([body namespace name ] (patch-namespaced-limit-range body namespace name nil))
  ([body namespace name optional-params]
   (:data (patch-namespaced-limit-range-with-http-info body namespace name optional-params))))

(defn patch-namespaced-persistent-volume-claim-with-http-info
  "partially update the specified PersistentVolumeClaim"
  ([body namespace name ] (patch-namespaced-persistent-volume-claim-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}" :patch
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn patch-namespaced-persistent-volume-claim
  "partially update the specified PersistentVolumeClaim"
  ([body namespace name ] (patch-namespaced-persistent-volume-claim body namespace name nil))
  ([body namespace name optional-params]
   (:data (patch-namespaced-persistent-volume-claim-with-http-info body namespace name optional-params))))

(defn patch-namespaced-persistent-volume-claim-status-with-http-info
  "partially update status of the specified PersistentVolumeClaim"
  ([body namespace name ] (patch-namespaced-persistent-volume-claim-status-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}/status" :patch
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn patch-namespaced-persistent-volume-claim-status
  "partially update status of the specified PersistentVolumeClaim"
  ([body namespace name ] (patch-namespaced-persistent-volume-claim-status body namespace name nil))
  ([body namespace name optional-params]
   (:data (patch-namespaced-persistent-volume-claim-status-with-http-info body namespace name optional-params))))

(defn patch-namespaced-pod-with-http-info
  "partially update the specified Pod"
  ([body namespace name ] (patch-namespaced-pod-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}" :patch
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn patch-namespaced-pod
  "partially update the specified Pod"
  ([body namespace name ] (patch-namespaced-pod body namespace name nil))
  ([body namespace name optional-params]
   (:data (patch-namespaced-pod-with-http-info body namespace name optional-params))))

(defn patch-namespaced-pod-status-with-http-info
  "partially update status of the specified Pod"
  ([body namespace name ] (patch-namespaced-pod-status-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/status" :patch
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn patch-namespaced-pod-status
  "partially update status of the specified Pod"
  ([body namespace name ] (patch-namespaced-pod-status body namespace name nil))
  ([body namespace name optional-params]
   (:data (patch-namespaced-pod-status-with-http-info body namespace name optional-params))))

(defn patch-namespaced-pod-template-with-http-info
  "partially update the specified PodTemplate"
  ([body namespace name ] (patch-namespaced-pod-template-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/podtemplates/{name}" :patch
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn patch-namespaced-pod-template
  "partially update the specified PodTemplate"
  ([body namespace name ] (patch-namespaced-pod-template body namespace name nil))
  ([body namespace name optional-params]
   (:data (patch-namespaced-pod-template-with-http-info body namespace name optional-params))))

(defn patch-namespaced-replication-controller-with-http-info
  "partially update the specified ReplicationController"
  ([body namespace name ] (patch-namespaced-replication-controller-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers/{name}" :patch
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn patch-namespaced-replication-controller
  "partially update the specified ReplicationController"
  ([body namespace name ] (patch-namespaced-replication-controller body namespace name nil))
  ([body namespace name optional-params]
   (:data (patch-namespaced-replication-controller-with-http-info body namespace name optional-params))))

(defn patch-namespaced-replication-controller-status-with-http-info
  "partially update status of the specified ReplicationController"
  ([body namespace name ] (patch-namespaced-replication-controller-status-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers/{name}/status" :patch
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn patch-namespaced-replication-controller-status
  "partially update status of the specified ReplicationController"
  ([body namespace name ] (patch-namespaced-replication-controller-status body namespace name nil))
  ([body namespace name optional-params]
   (:data (patch-namespaced-replication-controller-status-with-http-info body namespace name optional-params))))

(defn patch-namespaced-resource-quota-with-http-info
  "partially update the specified ResourceQuota"
  ([body namespace name ] (patch-namespaced-resource-quota-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/resourcequotas/{name}" :patch
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn patch-namespaced-resource-quota
  "partially update the specified ResourceQuota"
  ([body namespace name ] (patch-namespaced-resource-quota body namespace name nil))
  ([body namespace name optional-params]
   (:data (patch-namespaced-resource-quota-with-http-info body namespace name optional-params))))

(defn patch-namespaced-resource-quota-status-with-http-info
  "partially update status of the specified ResourceQuota"
  ([body namespace name ] (patch-namespaced-resource-quota-status-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/resourcequotas/{name}/status" :patch
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn patch-namespaced-resource-quota-status
  "partially update status of the specified ResourceQuota"
  ([body namespace name ] (patch-namespaced-resource-quota-status body namespace name nil))
  ([body namespace name optional-params]
   (:data (patch-namespaced-resource-quota-status-with-http-info body namespace name optional-params))))

(defn patch-namespaced-scale-scale-with-http-info
  "partially update scale of the specified Scale"
  ([body namespace name ] (patch-namespaced-scale-scale-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers/{name}/scale" :patch
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn patch-namespaced-scale-scale
  "partially update scale of the specified Scale"
  ([body namespace name ] (patch-namespaced-scale-scale body namespace name nil))
  ([body namespace name optional-params]
   (:data (patch-namespaced-scale-scale-with-http-info body namespace name optional-params))))

(defn patch-namespaced-secret-with-http-info
  "partially update the specified Secret"
  ([body namespace name ] (patch-namespaced-secret-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/secrets/{name}" :patch
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn patch-namespaced-secret
  "partially update the specified Secret"
  ([body namespace name ] (patch-namespaced-secret body namespace name nil))
  ([body namespace name optional-params]
   (:data (patch-namespaced-secret-with-http-info body namespace name optional-params))))

(defn patch-namespaced-service-with-http-info
  "partially update the specified Service"
  ([body namespace name ] (patch-namespaced-service-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}" :patch
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn patch-namespaced-service
  "partially update the specified Service"
  ([body namespace name ] (patch-namespaced-service body namespace name nil))
  ([body namespace name optional-params]
   (:data (patch-namespaced-service-with-http-info body namespace name optional-params))))

(defn patch-namespaced-service-account-with-http-info
  "partially update the specified ServiceAccount"
  ([body namespace name ] (patch-namespaced-service-account-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/serviceaccounts/{name}" :patch
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn patch-namespaced-service-account
  "partially update the specified ServiceAccount"
  ([body namespace name ] (patch-namespaced-service-account body namespace name nil))
  ([body namespace name optional-params]
   (:data (patch-namespaced-service-account-with-http-info body namespace name optional-params))))

(defn patch-namespaced-service-status-with-http-info
  "partially update status of the specified Service"
  ([body namespace name ] (patch-namespaced-service-status-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/status" :patch
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn patch-namespaced-service-status
  "partially update status of the specified Service"
  ([body namespace name ] (patch-namespaced-service-status body namespace name nil))
  ([body namespace name optional-params]
   (:data (patch-namespaced-service-status-with-http-info body namespace name optional-params))))

(defn patch-node-with-http-info
  "partially update the specified Node"
  ([body name ] (patch-node-with-http-info body name nil))
  ([body name {:keys [pretty ]}]
   (call-api "/api/v1/nodes/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn patch-node
  "partially update the specified Node"
  ([body name ] (patch-node body name nil))
  ([body name optional-params]
   (:data (patch-node-with-http-info body name optional-params))))

(defn patch-node-status-with-http-info
  "partially update status of the specified Node"
  ([body name ] (patch-node-status-with-http-info body name nil))
  ([body name {:keys [pretty ]}]
   (call-api "/api/v1/nodes/{name}/status" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn patch-node-status
  "partially update status of the specified Node"
  ([body name ] (patch-node-status body name nil))
  ([body name optional-params]
   (:data (patch-node-status-with-http-info body name optional-params))))

(defn patch-persistent-volume-with-http-info
  "partially update the specified PersistentVolume"
  ([body name ] (patch-persistent-volume-with-http-info body name nil))
  ([body name {:keys [pretty ]}]
   (call-api "/api/v1/persistentvolumes/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn patch-persistent-volume
  "partially update the specified PersistentVolume"
  ([body name ] (patch-persistent-volume body name nil))
  ([body name optional-params]
   (:data (patch-persistent-volume-with-http-info body name optional-params))))

(defn patch-persistent-volume-status-with-http-info
  "partially update status of the specified PersistentVolume"
  ([body name ] (patch-persistent-volume-status-with-http-info body name nil))
  ([body name {:keys [pretty ]}]
   (call-api "/api/v1/persistentvolumes/{name}/status" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn patch-persistent-volume-status
  "partially update status of the specified PersistentVolume"
  ([body name ] (patch-persistent-volume-status body name nil))
  ([body name optional-params]
   (:data (patch-persistent-volume-status-with-http-info body name optional-params))))

(defn proxy-delete-namespaced-pod-with-http-info
  "proxy DELETE requests to Pod"
  [namespace name ]
  (call-api "/api/v1/proxy/namespaces/{namespace}/pods/{name}" :delete
            {:path-params   {"namespace" namespace "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-delete-namespaced-pod
  "proxy DELETE requests to Pod"
  [namespace name ]
  (:data (proxy-delete-namespaced-pod-with-http-info namespace name)))

(defn proxy-delete-namespaced-pod-with-path-with-http-info
  "proxy DELETE requests to Pod"
  [namespace name path ]
  (call-api "/api/v1/proxy/namespaces/{namespace}/pods/{name}/{path}" :delete
            {:path-params   {"namespace" namespace "name" name "path" path }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-delete-namespaced-pod-with-path
  "proxy DELETE requests to Pod"
  [namespace name path ]
  (:data (proxy-delete-namespaced-pod-with-path-with-http-info namespace name path)))

(defn proxy-delete-namespaced-service-with-http-info
  "proxy DELETE requests to Service"
  [namespace name ]
  (call-api "/api/v1/proxy/namespaces/{namespace}/services/{name}" :delete
            {:path-params   {"namespace" namespace "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-delete-namespaced-service
  "proxy DELETE requests to Service"
  [namespace name ]
  (:data (proxy-delete-namespaced-service-with-http-info namespace name)))

(defn proxy-delete-namespaced-service-with-path-with-http-info
  "proxy DELETE requests to Service"
  [namespace name path ]
  (call-api "/api/v1/proxy/namespaces/{namespace}/services/{name}/{path}" :delete
            {:path-params   {"namespace" namespace "name" name "path" path }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-delete-namespaced-service-with-path
  "proxy DELETE requests to Service"
  [namespace name path ]
  (:data (proxy-delete-namespaced-service-with-path-with-http-info namespace name path)))

(defn proxy-delete-node-with-http-info
  "proxy DELETE requests to Node"
  [name ]
  (call-api "/api/v1/proxy/nodes/{name}" :delete
            {:path-params   {"name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-delete-node
  "proxy DELETE requests to Node"
  [name ]
  (:data (proxy-delete-node-with-http-info name)))

(defn proxy-delete-node-with-path-with-http-info
  "proxy DELETE requests to Node"
  [name path ]
  (call-api "/api/v1/proxy/nodes/{name}/{path}" :delete
            {:path-params   {"name" name "path" path }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-delete-node-with-path
  "proxy DELETE requests to Node"
  [name path ]
  (:data (proxy-delete-node-with-path-with-http-info name path)))

(defn proxy-get-namespaced-pod-with-http-info
  "proxy GET requests to Pod"
  [namespace name ]
  (call-api "/api/v1/proxy/namespaces/{namespace}/pods/{name}" :get
            {:path-params   {"namespace" namespace "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-get-namespaced-pod
  "proxy GET requests to Pod"
  [namespace name ]
  (:data (proxy-get-namespaced-pod-with-http-info namespace name)))

(defn proxy-get-namespaced-pod-with-path-with-http-info
  "proxy GET requests to Pod"
  [namespace name path ]
  (call-api "/api/v1/proxy/namespaces/{namespace}/pods/{name}/{path}" :get
            {:path-params   {"namespace" namespace "name" name "path" path }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-get-namespaced-pod-with-path
  "proxy GET requests to Pod"
  [namespace name path ]
  (:data (proxy-get-namespaced-pod-with-path-with-http-info namespace name path)))

(defn proxy-get-namespaced-service-with-http-info
  "proxy GET requests to Service"
  [namespace name ]
  (call-api "/api/v1/proxy/namespaces/{namespace}/services/{name}" :get
            {:path-params   {"namespace" namespace "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-get-namespaced-service
  "proxy GET requests to Service"
  [namespace name ]
  (:data (proxy-get-namespaced-service-with-http-info namespace name)))

(defn proxy-get-namespaced-service-with-path-with-http-info
  "proxy GET requests to Service"
  [namespace name path ]
  (call-api "/api/v1/proxy/namespaces/{namespace}/services/{name}/{path}" :get
            {:path-params   {"namespace" namespace "name" name "path" path }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-get-namespaced-service-with-path
  "proxy GET requests to Service"
  [namespace name path ]
  (:data (proxy-get-namespaced-service-with-path-with-http-info namespace name path)))

(defn proxy-get-node-with-http-info
  "proxy GET requests to Node"
  [name ]
  (call-api "/api/v1/proxy/nodes/{name}" :get
            {:path-params   {"name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-get-node
  "proxy GET requests to Node"
  [name ]
  (:data (proxy-get-node-with-http-info name)))

(defn proxy-get-node-with-path-with-http-info
  "proxy GET requests to Node"
  [name path ]
  (call-api "/api/v1/proxy/nodes/{name}/{path}" :get
            {:path-params   {"name" name "path" path }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-get-node-with-path
  "proxy GET requests to Node"
  [name path ]
  (:data (proxy-get-node-with-path-with-http-info name path)))

(defn proxy-head-namespaced-pod-with-http-info
  "proxy HEAD requests to Pod"
  [namespace name ]
  (call-api "/api/v1/proxy/namespaces/{namespace}/pods/{name}" :head
            {:path-params   {"namespace" namespace "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-head-namespaced-pod
  "proxy HEAD requests to Pod"
  [namespace name ]
  (:data (proxy-head-namespaced-pod-with-http-info namespace name)))

(defn proxy-head-namespaced-pod-with-path-with-http-info
  "proxy HEAD requests to Pod"
  [namespace name path ]
  (call-api "/api/v1/proxy/namespaces/{namespace}/pods/{name}/{path}" :head
            {:path-params   {"namespace" namespace "name" name "path" path }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-head-namespaced-pod-with-path
  "proxy HEAD requests to Pod"
  [namespace name path ]
  (:data (proxy-head-namespaced-pod-with-path-with-http-info namespace name path)))

(defn proxy-head-namespaced-service-with-http-info
  "proxy HEAD requests to Service"
  [namespace name ]
  (call-api "/api/v1/proxy/namespaces/{namespace}/services/{name}" :head
            {:path-params   {"namespace" namespace "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-head-namespaced-service
  "proxy HEAD requests to Service"
  [namespace name ]
  (:data (proxy-head-namespaced-service-with-http-info namespace name)))

(defn proxy-head-namespaced-service-with-path-with-http-info
  "proxy HEAD requests to Service"
  [namespace name path ]
  (call-api "/api/v1/proxy/namespaces/{namespace}/services/{name}/{path}" :head
            {:path-params   {"namespace" namespace "name" name "path" path }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-head-namespaced-service-with-path
  "proxy HEAD requests to Service"
  [namespace name path ]
  (:data (proxy-head-namespaced-service-with-path-with-http-info namespace name path)))

(defn proxy-head-node-with-http-info
  "proxy HEAD requests to Node"
  [name ]
  (call-api "/api/v1/proxy/nodes/{name}" :head
            {:path-params   {"name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-head-node
  "proxy HEAD requests to Node"
  [name ]
  (:data (proxy-head-node-with-http-info name)))

(defn proxy-head-node-with-path-with-http-info
  "proxy HEAD requests to Node"
  [name path ]
  (call-api "/api/v1/proxy/nodes/{name}/{path}" :head
            {:path-params   {"name" name "path" path }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-head-node-with-path
  "proxy HEAD requests to Node"
  [name path ]
  (:data (proxy-head-node-with-path-with-http-info name path)))

(defn proxy-options-namespaced-pod-with-http-info
  "proxy OPTIONS requests to Pod"
  [namespace name ]
  (call-api "/api/v1/proxy/namespaces/{namespace}/pods/{name}" :options
            {:path-params   {"namespace" namespace "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-options-namespaced-pod
  "proxy OPTIONS requests to Pod"
  [namespace name ]
  (:data (proxy-options-namespaced-pod-with-http-info namespace name)))

(defn proxy-options-namespaced-pod-with-path-with-http-info
  "proxy OPTIONS requests to Pod"
  [namespace name path ]
  (call-api "/api/v1/proxy/namespaces/{namespace}/pods/{name}/{path}" :options
            {:path-params   {"namespace" namespace "name" name "path" path }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-options-namespaced-pod-with-path
  "proxy OPTIONS requests to Pod"
  [namespace name path ]
  (:data (proxy-options-namespaced-pod-with-path-with-http-info namespace name path)))

(defn proxy-options-namespaced-service-with-http-info
  "proxy OPTIONS requests to Service"
  [namespace name ]
  (call-api "/api/v1/proxy/namespaces/{namespace}/services/{name}" :options
            {:path-params   {"namespace" namespace "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-options-namespaced-service
  "proxy OPTIONS requests to Service"
  [namespace name ]
  (:data (proxy-options-namespaced-service-with-http-info namespace name)))

(defn proxy-options-namespaced-service-with-path-with-http-info
  "proxy OPTIONS requests to Service"
  [namespace name path ]
  (call-api "/api/v1/proxy/namespaces/{namespace}/services/{name}/{path}" :options
            {:path-params   {"namespace" namespace "name" name "path" path }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-options-namespaced-service-with-path
  "proxy OPTIONS requests to Service"
  [namespace name path ]
  (:data (proxy-options-namespaced-service-with-path-with-http-info namespace name path)))

(defn proxy-options-node-with-http-info
  "proxy OPTIONS requests to Node"
  [name ]
  (call-api "/api/v1/proxy/nodes/{name}" :options
            {:path-params   {"name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-options-node
  "proxy OPTIONS requests to Node"
  [name ]
  (:data (proxy-options-node-with-http-info name)))

(defn proxy-options-node-with-path-with-http-info
  "proxy OPTIONS requests to Node"
  [name path ]
  (call-api "/api/v1/proxy/nodes/{name}/{path}" :options
            {:path-params   {"name" name "path" path }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-options-node-with-path
  "proxy OPTIONS requests to Node"
  [name path ]
  (:data (proxy-options-node-with-path-with-http-info name path)))

(defn proxy-post-namespaced-pod-with-http-info
  "proxy POST requests to Pod"
  [namespace name ]
  (call-api "/api/v1/proxy/namespaces/{namespace}/pods/{name}" :post
            {:path-params   {"namespace" namespace "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-post-namespaced-pod
  "proxy POST requests to Pod"
  [namespace name ]
  (:data (proxy-post-namespaced-pod-with-http-info namespace name)))

(defn proxy-post-namespaced-pod-with-path-with-http-info
  "proxy POST requests to Pod"
  [namespace name path ]
  (call-api "/api/v1/proxy/namespaces/{namespace}/pods/{name}/{path}" :post
            {:path-params   {"namespace" namespace "name" name "path" path }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-post-namespaced-pod-with-path
  "proxy POST requests to Pod"
  [namespace name path ]
  (:data (proxy-post-namespaced-pod-with-path-with-http-info namespace name path)))

(defn proxy-post-namespaced-service-with-http-info
  "proxy POST requests to Service"
  [namespace name ]
  (call-api "/api/v1/proxy/namespaces/{namespace}/services/{name}" :post
            {:path-params   {"namespace" namespace "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-post-namespaced-service
  "proxy POST requests to Service"
  [namespace name ]
  (:data (proxy-post-namespaced-service-with-http-info namespace name)))

(defn proxy-post-namespaced-service-with-path-with-http-info
  "proxy POST requests to Service"
  [namespace name path ]
  (call-api "/api/v1/proxy/namespaces/{namespace}/services/{name}/{path}" :post
            {:path-params   {"namespace" namespace "name" name "path" path }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-post-namespaced-service-with-path
  "proxy POST requests to Service"
  [namespace name path ]
  (:data (proxy-post-namespaced-service-with-path-with-http-info namespace name path)))

(defn proxy-post-node-with-http-info
  "proxy POST requests to Node"
  [name ]
  (call-api "/api/v1/proxy/nodes/{name}" :post
            {:path-params   {"name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-post-node
  "proxy POST requests to Node"
  [name ]
  (:data (proxy-post-node-with-http-info name)))

(defn proxy-post-node-with-path-with-http-info
  "proxy POST requests to Node"
  [name path ]
  (call-api "/api/v1/proxy/nodes/{name}/{path}" :post
            {:path-params   {"name" name "path" path }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-post-node-with-path
  "proxy POST requests to Node"
  [name path ]
  (:data (proxy-post-node-with-path-with-http-info name path)))

(defn proxy-put-namespaced-pod-with-http-info
  "proxy PUT requests to Pod"
  [namespace name ]
  (call-api "/api/v1/proxy/namespaces/{namespace}/pods/{name}" :put
            {:path-params   {"namespace" namespace "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-put-namespaced-pod
  "proxy PUT requests to Pod"
  [namespace name ]
  (:data (proxy-put-namespaced-pod-with-http-info namespace name)))

(defn proxy-put-namespaced-pod-with-path-with-http-info
  "proxy PUT requests to Pod"
  [namespace name path ]
  (call-api "/api/v1/proxy/namespaces/{namespace}/pods/{name}/{path}" :put
            {:path-params   {"namespace" namespace "name" name "path" path }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-put-namespaced-pod-with-path
  "proxy PUT requests to Pod"
  [namespace name path ]
  (:data (proxy-put-namespaced-pod-with-path-with-http-info namespace name path)))

(defn proxy-put-namespaced-service-with-http-info
  "proxy PUT requests to Service"
  [namespace name ]
  (call-api "/api/v1/proxy/namespaces/{namespace}/services/{name}" :put
            {:path-params   {"namespace" namespace "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-put-namespaced-service
  "proxy PUT requests to Service"
  [namespace name ]
  (:data (proxy-put-namespaced-service-with-http-info namespace name)))

(defn proxy-put-namespaced-service-with-path-with-http-info
  "proxy PUT requests to Service"
  [namespace name path ]
  (call-api "/api/v1/proxy/namespaces/{namespace}/services/{name}/{path}" :put
            {:path-params   {"namespace" namespace "name" name "path" path }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-put-namespaced-service-with-path
  "proxy PUT requests to Service"
  [namespace name path ]
  (:data (proxy-put-namespaced-service-with-path-with-http-info namespace name path)))

(defn proxy-put-node-with-http-info
  "proxy PUT requests to Node"
  [name ]
  (call-api "/api/v1/proxy/nodes/{name}" :put
            {:path-params   {"name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-put-node
  "proxy PUT requests to Node"
  [name ]
  (:data (proxy-put-node-with-http-info name)))

(defn proxy-put-node-with-path-with-http-info
  "proxy PUT requests to Node"
  [name path ]
  (call-api "/api/v1/proxy/nodes/{name}/{path}" :put
            {:path-params   {"name" name "path" path }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["*/*"]
             :accepts       ["*/*"]
             :auth-names    []}))

(defn proxy-put-node-with-path
  "proxy PUT requests to Node"
  [name path ]
  (:data (proxy-put-node-with-path-with-http-info name path)))

(defn read-component-status-with-http-info
  "read the specified ComponentStatus"
  ([name ] (read-component-status-with-http-info name nil))
  ([name {:keys [pretty ]}]
   (call-api "/api/v1/componentstatuses/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn read-component-status
  "read the specified ComponentStatus"
  ([name ] (read-component-status name nil))
  ([name optional-params]
   (:data (read-component-status-with-http-info name optional-params))))

(defn read-namespace-with-http-info
  "read the specified Namespace"
  ([name ] (read-namespace-with-http-info name nil))
  ([name {:keys [pretty export exact ]}]
   (call-api "/api/v1/namespaces/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "export" export "exact" exact }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn read-namespace
  "read the specified Namespace"
  ([name ] (read-namespace name nil))
  ([name optional-params]
   (:data (read-namespace-with-http-info name optional-params))))

(defn read-namespace-status-with-http-info
  "read status of the specified Namespace"
  ([name ] (read-namespace-status-with-http-info name nil))
  ([name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{name}/status" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn read-namespace-status
  "read status of the specified Namespace"
  ([name ] (read-namespace-status name nil))
  ([name optional-params]
   (:data (read-namespace-status-with-http-info name optional-params))))

(defn read-namespaced-config-map-with-http-info
  "read the specified ConfigMap"
  ([namespace name ] (read-namespaced-config-map-with-http-info namespace name nil))
  ([namespace name {:keys [pretty export exact ]}]
   (call-api "/api/v1/namespaces/{namespace}/configmaps/{name}" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "export" export "exact" exact }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn read-namespaced-config-map
  "read the specified ConfigMap"
  ([namespace name ] (read-namespaced-config-map namespace name nil))
  ([namespace name optional-params]
   (:data (read-namespaced-config-map-with-http-info namespace name optional-params))))

(defn read-namespaced-endpoints-with-http-info
  "read the specified Endpoints"
  ([namespace name ] (read-namespaced-endpoints-with-http-info namespace name nil))
  ([namespace name {:keys [pretty export exact ]}]
   (call-api "/api/v1/namespaces/{namespace}/endpoints/{name}" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "export" export "exact" exact }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn read-namespaced-endpoints
  "read the specified Endpoints"
  ([namespace name ] (read-namespaced-endpoints namespace name nil))
  ([namespace name optional-params]
   (:data (read-namespaced-endpoints-with-http-info namespace name optional-params))))

(defn read-namespaced-event-with-http-info
  "read the specified Event"
  ([namespace name ] (read-namespaced-event-with-http-info namespace name nil))
  ([namespace name {:keys [pretty export exact ]}]
   (call-api "/api/v1/namespaces/{namespace}/events/{name}" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "export" export "exact" exact }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn read-namespaced-event
  "read the specified Event"
  ([namespace name ] (read-namespaced-event namespace name nil))
  ([namespace name optional-params]
   (:data (read-namespaced-event-with-http-info namespace name optional-params))))

(defn read-namespaced-limit-range-with-http-info
  "read the specified LimitRange"
  ([namespace name ] (read-namespaced-limit-range-with-http-info namespace name nil))
  ([namespace name {:keys [pretty export exact ]}]
   (call-api "/api/v1/namespaces/{namespace}/limitranges/{name}" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "export" export "exact" exact }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn read-namespaced-limit-range
  "read the specified LimitRange"
  ([namespace name ] (read-namespaced-limit-range namespace name nil))
  ([namespace name optional-params]
   (:data (read-namespaced-limit-range-with-http-info namespace name optional-params))))

(defn read-namespaced-persistent-volume-claim-with-http-info
  "read the specified PersistentVolumeClaim"
  ([namespace name ] (read-namespaced-persistent-volume-claim-with-http-info namespace name nil))
  ([namespace name {:keys [pretty export exact ]}]
   (call-api "/api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "export" export "exact" exact }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn read-namespaced-persistent-volume-claim
  "read the specified PersistentVolumeClaim"
  ([namespace name ] (read-namespaced-persistent-volume-claim namespace name nil))
  ([namespace name optional-params]
   (:data (read-namespaced-persistent-volume-claim-with-http-info namespace name optional-params))))

(defn read-namespaced-persistent-volume-claim-status-with-http-info
  "read status of the specified PersistentVolumeClaim"
  ([namespace name ] (read-namespaced-persistent-volume-claim-status-with-http-info namespace name nil))
  ([namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}/status" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn read-namespaced-persistent-volume-claim-status
  "read status of the specified PersistentVolumeClaim"
  ([namespace name ] (read-namespaced-persistent-volume-claim-status namespace name nil))
  ([namespace name optional-params]
   (:data (read-namespaced-persistent-volume-claim-status-with-http-info namespace name optional-params))))

(defn read-namespaced-pod-with-http-info
  "read the specified Pod"
  ([namespace name ] (read-namespaced-pod-with-http-info namespace name nil))
  ([namespace name {:keys [pretty export exact ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "export" export "exact" exact }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn read-namespaced-pod
  "read the specified Pod"
  ([namespace name ] (read-namespaced-pod namespace name nil))
  ([namespace name optional-params]
   (:data (read-namespaced-pod-with-http-info namespace name optional-params))))

(defn read-namespaced-pod-log-with-http-info
  "read log of the specified Pod"
  ([namespace name ] (read-namespaced-pod-log-with-http-info namespace name nil))
  ([namespace name {:keys [pretty container follow previous since-seconds since-time timestamps tail-lines limit-bytes ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/log" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "container" container "follow" follow "previous" previous "sinceSeconds" since-seconds "sinceTime" since-time "timestamps" timestamps "tailLines" tail-lines "limitBytes" limit-bytes }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["text/plain" "application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn read-namespaced-pod-log
  "read log of the specified Pod"
  ([namespace name ] (read-namespaced-pod-log namespace name nil))
  ([namespace name optional-params]
   (:data (read-namespaced-pod-log-with-http-info namespace name optional-params))))

(defn read-namespaced-pod-status-with-http-info
  "read status of the specified Pod"
  ([namespace name ] (read-namespaced-pod-status-with-http-info namespace name nil))
  ([namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/status" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn read-namespaced-pod-status
  "read status of the specified Pod"
  ([namespace name ] (read-namespaced-pod-status namespace name nil))
  ([namespace name optional-params]
   (:data (read-namespaced-pod-status-with-http-info namespace name optional-params))))

(defn read-namespaced-pod-template-with-http-info
  "read the specified PodTemplate"
  ([namespace name ] (read-namespaced-pod-template-with-http-info namespace name nil))
  ([namespace name {:keys [pretty export exact ]}]
   (call-api "/api/v1/namespaces/{namespace}/podtemplates/{name}" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "export" export "exact" exact }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn read-namespaced-pod-template
  "read the specified PodTemplate"
  ([namespace name ] (read-namespaced-pod-template namespace name nil))
  ([namespace name optional-params]
   (:data (read-namespaced-pod-template-with-http-info namespace name optional-params))))

(defn read-namespaced-replication-controller-with-http-info
  "read the specified ReplicationController"
  ([namespace name ] (read-namespaced-replication-controller-with-http-info namespace name nil))
  ([namespace name {:keys [pretty export exact ]}]
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers/{name}" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "export" export "exact" exact }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn read-namespaced-replication-controller
  "read the specified ReplicationController"
  ([namespace name ] (read-namespaced-replication-controller namespace name nil))
  ([namespace name optional-params]
   (:data (read-namespaced-replication-controller-with-http-info namespace name optional-params))))

(defn read-namespaced-replication-controller-status-with-http-info
  "read status of the specified ReplicationController"
  ([namespace name ] (read-namespaced-replication-controller-status-with-http-info namespace name nil))
  ([namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers/{name}/status" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn read-namespaced-replication-controller-status
  "read status of the specified ReplicationController"
  ([namespace name ] (read-namespaced-replication-controller-status namespace name nil))
  ([namespace name optional-params]
   (:data (read-namespaced-replication-controller-status-with-http-info namespace name optional-params))))

(defn read-namespaced-resource-quota-with-http-info
  "read the specified ResourceQuota"
  ([namespace name ] (read-namespaced-resource-quota-with-http-info namespace name nil))
  ([namespace name {:keys [pretty export exact ]}]
   (call-api "/api/v1/namespaces/{namespace}/resourcequotas/{name}" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "export" export "exact" exact }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn read-namespaced-resource-quota
  "read the specified ResourceQuota"
  ([namespace name ] (read-namespaced-resource-quota namespace name nil))
  ([namespace name optional-params]
   (:data (read-namespaced-resource-quota-with-http-info namespace name optional-params))))

(defn read-namespaced-resource-quota-status-with-http-info
  "read status of the specified ResourceQuota"
  ([namespace name ] (read-namespaced-resource-quota-status-with-http-info namespace name nil))
  ([namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/resourcequotas/{name}/status" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn read-namespaced-resource-quota-status
  "read status of the specified ResourceQuota"
  ([namespace name ] (read-namespaced-resource-quota-status namespace name nil))
  ([namespace name optional-params]
   (:data (read-namespaced-resource-quota-status-with-http-info namespace name optional-params))))

(defn read-namespaced-scale-scale-with-http-info
  "read scale of the specified Scale"
  ([namespace name ] (read-namespaced-scale-scale-with-http-info namespace name nil))
  ([namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers/{name}/scale" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn read-namespaced-scale-scale
  "read scale of the specified Scale"
  ([namespace name ] (read-namespaced-scale-scale namespace name nil))
  ([namespace name optional-params]
   (:data (read-namespaced-scale-scale-with-http-info namespace name optional-params))))

(defn read-namespaced-secret-with-http-info
  "read the specified Secret"
  ([namespace name ] (read-namespaced-secret-with-http-info namespace name nil))
  ([namespace name {:keys [pretty export exact ]}]
   (call-api "/api/v1/namespaces/{namespace}/secrets/{name}" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "export" export "exact" exact }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn read-namespaced-secret
  "read the specified Secret"
  ([namespace name ] (read-namespaced-secret namespace name nil))
  ([namespace name optional-params]
   (:data (read-namespaced-secret-with-http-info namespace name optional-params))))

(defn read-namespaced-service-with-http-info
  "read the specified Service"
  ([namespace name ] (read-namespaced-service-with-http-info namespace name nil))
  ([namespace name {:keys [pretty export exact ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "export" export "exact" exact }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn read-namespaced-service
  "read the specified Service"
  ([namespace name ] (read-namespaced-service namespace name nil))
  ([namespace name optional-params]
   (:data (read-namespaced-service-with-http-info namespace name optional-params))))

(defn read-namespaced-service-account-with-http-info
  "read the specified ServiceAccount"
  ([namespace name ] (read-namespaced-service-account-with-http-info namespace name nil))
  ([namespace name {:keys [pretty export exact ]}]
   (call-api "/api/v1/namespaces/{namespace}/serviceaccounts/{name}" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "export" export "exact" exact }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn read-namespaced-service-account
  "read the specified ServiceAccount"
  ([namespace name ] (read-namespaced-service-account namespace name nil))
  ([namespace name optional-params]
   (:data (read-namespaced-service-account-with-http-info namespace name optional-params))))

(defn read-namespaced-service-status-with-http-info
  "read status of the specified Service"
  ([namespace name ] (read-namespaced-service-status-with-http-info namespace name nil))
  ([namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/status" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn read-namespaced-service-status
  "read status of the specified Service"
  ([namespace name ] (read-namespaced-service-status namespace name nil))
  ([namespace name optional-params]
   (:data (read-namespaced-service-status-with-http-info namespace name optional-params))))

(defn read-node-with-http-info
  "read the specified Node"
  ([name ] (read-node-with-http-info name nil))
  ([name {:keys [pretty export exact ]}]
   (call-api "/api/v1/nodes/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "export" export "exact" exact }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn read-node
  "read the specified Node"
  ([name ] (read-node name nil))
  ([name optional-params]
   (:data (read-node-with-http-info name optional-params))))

(defn read-node-status-with-http-info
  "read status of the specified Node"
  ([name ] (read-node-status-with-http-info name nil))
  ([name {:keys [pretty ]}]
   (call-api "/api/v1/nodes/{name}/status" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn read-node-status
  "read status of the specified Node"
  ([name ] (read-node-status name nil))
  ([name optional-params]
   (:data (read-node-status-with-http-info name optional-params))))

(defn read-persistent-volume-with-http-info
  "read the specified PersistentVolume"
  ([name ] (read-persistent-volume-with-http-info name nil))
  ([name {:keys [pretty export exact ]}]
   (call-api "/api/v1/persistentvolumes/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "export" export "exact" exact }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn read-persistent-volume
  "read the specified PersistentVolume"
  ([name ] (read-persistent-volume name nil))
  ([name optional-params]
   (:data (read-persistent-volume-with-http-info name optional-params))))

(defn read-persistent-volume-status-with-http-info
  "read status of the specified PersistentVolume"
  ([name ] (read-persistent-volume-status-with-http-info name nil))
  ([name {:keys [pretty ]}]
   (call-api "/api/v1/persistentvolumes/{name}/status" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn read-persistent-volume-status
  "read status of the specified PersistentVolume"
  ([name ] (read-persistent-volume-status name nil))
  ([name optional-params]
   (:data (read-persistent-volume-status-with-http-info name optional-params))))

(defn replace-namespace-with-http-info
  "replace the specified Namespace"
  ([body name ] (replace-namespace-with-http-info body name nil))
  ([body name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn replace-namespace
  "replace the specified Namespace"
  ([body name ] (replace-namespace body name nil))
  ([body name optional-params]
   (:data (replace-namespace-with-http-info body name optional-params))))

(defn replace-namespace-finalize-with-http-info
  "replace finalize of the specified Namespace"
  ([body name ] (replace-namespace-finalize-with-http-info body name nil))
  ([body name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{name}/finalize" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn replace-namespace-finalize
  "replace finalize of the specified Namespace"
  ([body name ] (replace-namespace-finalize body name nil))
  ([body name optional-params]
   (:data (replace-namespace-finalize-with-http-info body name optional-params))))

(defn replace-namespace-status-with-http-info
  "replace status of the specified Namespace"
  ([body name ] (replace-namespace-status-with-http-info body name nil))
  ([body name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{name}/status" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn replace-namespace-status
  "replace status of the specified Namespace"
  ([body name ] (replace-namespace-status body name nil))
  ([body name optional-params]
   (:data (replace-namespace-status-with-http-info body name optional-params))))

(defn replace-namespaced-config-map-with-http-info
  "replace the specified ConfigMap"
  ([body namespace name ] (replace-namespaced-config-map-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/configmaps/{name}" :put
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn replace-namespaced-config-map
  "replace the specified ConfigMap"
  ([body namespace name ] (replace-namespaced-config-map body namespace name nil))
  ([body namespace name optional-params]
   (:data (replace-namespaced-config-map-with-http-info body namespace name optional-params))))

(defn replace-namespaced-endpoints-with-http-info
  "replace the specified Endpoints"
  ([body namespace name ] (replace-namespaced-endpoints-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/endpoints/{name}" :put
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn replace-namespaced-endpoints
  "replace the specified Endpoints"
  ([body namespace name ] (replace-namespaced-endpoints body namespace name nil))
  ([body namespace name optional-params]
   (:data (replace-namespaced-endpoints-with-http-info body namespace name optional-params))))

(defn replace-namespaced-event-with-http-info
  "replace the specified Event"
  ([body namespace name ] (replace-namespaced-event-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/events/{name}" :put
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn replace-namespaced-event
  "replace the specified Event"
  ([body namespace name ] (replace-namespaced-event body namespace name nil))
  ([body namespace name optional-params]
   (:data (replace-namespaced-event-with-http-info body namespace name optional-params))))

(defn replace-namespaced-limit-range-with-http-info
  "replace the specified LimitRange"
  ([body namespace name ] (replace-namespaced-limit-range-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/limitranges/{name}" :put
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn replace-namespaced-limit-range
  "replace the specified LimitRange"
  ([body namespace name ] (replace-namespaced-limit-range body namespace name nil))
  ([body namespace name optional-params]
   (:data (replace-namespaced-limit-range-with-http-info body namespace name optional-params))))

(defn replace-namespaced-persistent-volume-claim-with-http-info
  "replace the specified PersistentVolumeClaim"
  ([body namespace name ] (replace-namespaced-persistent-volume-claim-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}" :put
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn replace-namespaced-persistent-volume-claim
  "replace the specified PersistentVolumeClaim"
  ([body namespace name ] (replace-namespaced-persistent-volume-claim body namespace name nil))
  ([body namespace name optional-params]
   (:data (replace-namespaced-persistent-volume-claim-with-http-info body namespace name optional-params))))

(defn replace-namespaced-persistent-volume-claim-status-with-http-info
  "replace status of the specified PersistentVolumeClaim"
  ([body namespace name ] (replace-namespaced-persistent-volume-claim-status-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}/status" :put
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn replace-namespaced-persistent-volume-claim-status
  "replace status of the specified PersistentVolumeClaim"
  ([body namespace name ] (replace-namespaced-persistent-volume-claim-status body namespace name nil))
  ([body namespace name optional-params]
   (:data (replace-namespaced-persistent-volume-claim-status-with-http-info body namespace name optional-params))))

(defn replace-namespaced-pod-with-http-info
  "replace the specified Pod"
  ([body namespace name ] (replace-namespaced-pod-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}" :put
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn replace-namespaced-pod
  "replace the specified Pod"
  ([body namespace name ] (replace-namespaced-pod body namespace name nil))
  ([body namespace name optional-params]
   (:data (replace-namespaced-pod-with-http-info body namespace name optional-params))))

(defn replace-namespaced-pod-status-with-http-info
  "replace status of the specified Pod"
  ([body namespace name ] (replace-namespaced-pod-status-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/status" :put
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn replace-namespaced-pod-status
  "replace status of the specified Pod"
  ([body namespace name ] (replace-namespaced-pod-status body namespace name nil))
  ([body namespace name optional-params]
   (:data (replace-namespaced-pod-status-with-http-info body namespace name optional-params))))

(defn replace-namespaced-pod-template-with-http-info
  "replace the specified PodTemplate"
  ([body namespace name ] (replace-namespaced-pod-template-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/podtemplates/{name}" :put
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn replace-namespaced-pod-template
  "replace the specified PodTemplate"
  ([body namespace name ] (replace-namespaced-pod-template body namespace name nil))
  ([body namespace name optional-params]
   (:data (replace-namespaced-pod-template-with-http-info body namespace name optional-params))))

(defn replace-namespaced-replication-controller-with-http-info
  "replace the specified ReplicationController"
  ([body namespace name ] (replace-namespaced-replication-controller-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers/{name}" :put
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn replace-namespaced-replication-controller
  "replace the specified ReplicationController"
  ([body namespace name ] (replace-namespaced-replication-controller body namespace name nil))
  ([body namespace name optional-params]
   (:data (replace-namespaced-replication-controller-with-http-info body namespace name optional-params))))

(defn replace-namespaced-replication-controller-status-with-http-info
  "replace status of the specified ReplicationController"
  ([body namespace name ] (replace-namespaced-replication-controller-status-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers/{name}/status" :put
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn replace-namespaced-replication-controller-status
  "replace status of the specified ReplicationController"
  ([body namespace name ] (replace-namespaced-replication-controller-status body namespace name nil))
  ([body namespace name optional-params]
   (:data (replace-namespaced-replication-controller-status-with-http-info body namespace name optional-params))))

(defn replace-namespaced-resource-quota-with-http-info
  "replace the specified ResourceQuota"
  ([body namespace name ] (replace-namespaced-resource-quota-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/resourcequotas/{name}" :put
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn replace-namespaced-resource-quota
  "replace the specified ResourceQuota"
  ([body namespace name ] (replace-namespaced-resource-quota body namespace name nil))
  ([body namespace name optional-params]
   (:data (replace-namespaced-resource-quota-with-http-info body namespace name optional-params))))

(defn replace-namespaced-resource-quota-status-with-http-info
  "replace status of the specified ResourceQuota"
  ([body namespace name ] (replace-namespaced-resource-quota-status-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/resourcequotas/{name}/status" :put
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn replace-namespaced-resource-quota-status
  "replace status of the specified ResourceQuota"
  ([body namespace name ] (replace-namespaced-resource-quota-status body namespace name nil))
  ([body namespace name optional-params]
   (:data (replace-namespaced-resource-quota-status-with-http-info body namespace name optional-params))))

(defn replace-namespaced-scale-scale-with-http-info
  "replace scale of the specified Scale"
  ([body namespace name ] (replace-namespaced-scale-scale-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers/{name}/scale" :put
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn replace-namespaced-scale-scale
  "replace scale of the specified Scale"
  ([body namespace name ] (replace-namespaced-scale-scale body namespace name nil))
  ([body namespace name optional-params]
   (:data (replace-namespaced-scale-scale-with-http-info body namespace name optional-params))))

(defn replace-namespaced-secret-with-http-info
  "replace the specified Secret"
  ([body namespace name ] (replace-namespaced-secret-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/secrets/{name}" :put
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn replace-namespaced-secret
  "replace the specified Secret"
  ([body namespace name ] (replace-namespaced-secret body namespace name nil))
  ([body namespace name optional-params]
   (:data (replace-namespaced-secret-with-http-info body namespace name optional-params))))

(defn replace-namespaced-service-with-http-info
  "replace the specified Service"
  ([body namespace name ] (replace-namespaced-service-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}" :put
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn replace-namespaced-service
  "replace the specified Service"
  ([body namespace name ] (replace-namespaced-service body namespace name nil))
  ([body namespace name optional-params]
   (:data (replace-namespaced-service-with-http-info body namespace name optional-params))))

(defn replace-namespaced-service-account-with-http-info
  "replace the specified ServiceAccount"
  ([body namespace name ] (replace-namespaced-service-account-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/serviceaccounts/{name}" :put
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn replace-namespaced-service-account
  "replace the specified ServiceAccount"
  ([body namespace name ] (replace-namespaced-service-account body namespace name nil))
  ([body namespace name optional-params]
   (:data (replace-namespaced-service-account-with-http-info body namespace name optional-params))))

(defn replace-namespaced-service-status-with-http-info
  "replace status of the specified Service"
  ([body namespace name ] (replace-namespaced-service-status-with-http-info body namespace name nil))
  ([body namespace name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/status" :put
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn replace-namespaced-service-status
  "replace status of the specified Service"
  ([body namespace name ] (replace-namespaced-service-status body namespace name nil))
  ([body namespace name optional-params]
   (:data (replace-namespaced-service-status-with-http-info body namespace name optional-params))))

(defn replace-node-with-http-info
  "replace the specified Node"
  ([body name ] (replace-node-with-http-info body name nil))
  ([body name {:keys [pretty ]}]
   (call-api "/api/v1/nodes/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn replace-node
  "replace the specified Node"
  ([body name ] (replace-node body name nil))
  ([body name optional-params]
   (:data (replace-node-with-http-info body name optional-params))))

(defn replace-node-status-with-http-info
  "replace status of the specified Node"
  ([body name ] (replace-node-status-with-http-info body name nil))
  ([body name {:keys [pretty ]}]
   (call-api "/api/v1/nodes/{name}/status" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn replace-node-status
  "replace status of the specified Node"
  ([body name ] (replace-node-status body name nil))
  ([body name optional-params]
   (:data (replace-node-status-with-http-info body name optional-params))))

(defn replace-persistent-volume-with-http-info
  "replace the specified PersistentVolume"
  ([body name ] (replace-persistent-volume-with-http-info body name nil))
  ([body name {:keys [pretty ]}]
   (call-api "/api/v1/persistentvolumes/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn replace-persistent-volume
  "replace the specified PersistentVolume"
  ([body name ] (replace-persistent-volume body name nil))
  ([body name optional-params]
   (:data (replace-persistent-volume-with-http-info body name optional-params))))

(defn replace-persistent-volume-status-with-http-info
  "replace status of the specified PersistentVolume"
  ([body name ] (replace-persistent-volume-status-with-http-info body name nil))
  ([body name {:keys [pretty ]}]
   (call-api "/api/v1/persistentvolumes/{name}/status" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    []})))

(defn replace-persistent-volume-status
  "replace status of the specified PersistentVolume"
  ([body name ] (replace-persistent-volume-status body name nil))
  ([body name optional-params]
   (:data (replace-persistent-volume-status-with-http-info body name optional-params))))

(defn watch-config-map-list-for-all-namespaces-with-http-info
  "watch individual changes to a list of ConfigMap"
  ([] (watch-config-map-list-for-all-namespaces-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/configmaps" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-config-map-list-for-all-namespaces
  "watch individual changes to a list of ConfigMap"
  ([] (watch-config-map-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-config-map-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-endpoints-list-for-all-namespaces-with-http-info
  "watch individual changes to a list of Endpoints"
  ([] (watch-endpoints-list-for-all-namespaces-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/endpoints" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-endpoints-list-for-all-namespaces
  "watch individual changes to a list of Endpoints"
  ([] (watch-endpoints-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-endpoints-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-event-list-for-all-namespaces-with-http-info
  "watch individual changes to a list of Event"
  ([] (watch-event-list-for-all-namespaces-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/events" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-event-list-for-all-namespaces
  "watch individual changes to a list of Event"
  ([] (watch-event-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-event-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-limit-range-list-for-all-namespaces-with-http-info
  "watch individual changes to a list of LimitRange"
  ([] (watch-limit-range-list-for-all-namespaces-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/limitranges" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-limit-range-list-for-all-namespaces
  "watch individual changes to a list of LimitRange"
  ([] (watch-limit-range-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-limit-range-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-namespace-with-http-info
  "watch changes to an object of kind Namespace"
  ([name ] (watch-namespace-with-http-info name nil))
  ([name {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/namespaces/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-namespace
  "watch changes to an object of kind Namespace"
  ([name ] (watch-namespace name nil))
  ([name optional-params]
   (:data (watch-namespace-with-http-info name optional-params))))

(defn watch-namespace-list-with-http-info
  "watch individual changes to a list of Namespace"
  ([] (watch-namespace-list-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/namespaces" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-namespace-list
  "watch individual changes to a list of Namespace"
  ([] (watch-namespace-list nil))
  ([optional-params]
   (:data (watch-namespace-list-with-http-info optional-params))))

(defn watch-namespaced-config-map-with-http-info
  "watch changes to an object of kind ConfigMap"
  ([namespace name ] (watch-namespaced-config-map-with-http-info namespace name nil))
  ([namespace name {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/configmaps/{name}" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-namespaced-config-map
  "watch changes to an object of kind ConfigMap"
  ([namespace name ] (watch-namespaced-config-map namespace name nil))
  ([namespace name optional-params]
   (:data (watch-namespaced-config-map-with-http-info namespace name optional-params))))

(defn watch-namespaced-config-map-list-with-http-info
  "watch individual changes to a list of ConfigMap"
  ([namespace ] (watch-namespaced-config-map-list-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/configmaps" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-namespaced-config-map-list
  "watch individual changes to a list of ConfigMap"
  ([namespace ] (watch-namespaced-config-map-list namespace nil))
  ([namespace optional-params]
   (:data (watch-namespaced-config-map-list-with-http-info namespace optional-params))))

(defn watch-namespaced-endpoints-with-http-info
  "watch changes to an object of kind Endpoints"
  ([namespace name ] (watch-namespaced-endpoints-with-http-info namespace name nil))
  ([namespace name {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/endpoints/{name}" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-namespaced-endpoints
  "watch changes to an object of kind Endpoints"
  ([namespace name ] (watch-namespaced-endpoints namespace name nil))
  ([namespace name optional-params]
   (:data (watch-namespaced-endpoints-with-http-info namespace name optional-params))))

(defn watch-namespaced-endpoints-list-with-http-info
  "watch individual changes to a list of Endpoints"
  ([namespace ] (watch-namespaced-endpoints-list-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/endpoints" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-namespaced-endpoints-list
  "watch individual changes to a list of Endpoints"
  ([namespace ] (watch-namespaced-endpoints-list namespace nil))
  ([namespace optional-params]
   (:data (watch-namespaced-endpoints-list-with-http-info namespace optional-params))))

(defn watch-namespaced-event-with-http-info
  "watch changes to an object of kind Event"
  ([namespace name ] (watch-namespaced-event-with-http-info namespace name nil))
  ([namespace name {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/events/{name}" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-namespaced-event
  "watch changes to an object of kind Event"
  ([namespace name ] (watch-namespaced-event namespace name nil))
  ([namespace name optional-params]
   (:data (watch-namespaced-event-with-http-info namespace name optional-params))))

(defn watch-namespaced-event-list-with-http-info
  "watch individual changes to a list of Event"
  ([namespace ] (watch-namespaced-event-list-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/events" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-namespaced-event-list
  "watch individual changes to a list of Event"
  ([namespace ] (watch-namespaced-event-list namespace nil))
  ([namespace optional-params]
   (:data (watch-namespaced-event-list-with-http-info namespace optional-params))))

(defn watch-namespaced-limit-range-with-http-info
  "watch changes to an object of kind LimitRange"
  ([namespace name ] (watch-namespaced-limit-range-with-http-info namespace name nil))
  ([namespace name {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/limitranges/{name}" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-namespaced-limit-range
  "watch changes to an object of kind LimitRange"
  ([namespace name ] (watch-namespaced-limit-range namespace name nil))
  ([namespace name optional-params]
   (:data (watch-namespaced-limit-range-with-http-info namespace name optional-params))))

(defn watch-namespaced-limit-range-list-with-http-info
  "watch individual changes to a list of LimitRange"
  ([namespace ] (watch-namespaced-limit-range-list-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/limitranges" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-namespaced-limit-range-list
  "watch individual changes to a list of LimitRange"
  ([namespace ] (watch-namespaced-limit-range-list namespace nil))
  ([namespace optional-params]
   (:data (watch-namespaced-limit-range-list-with-http-info namespace optional-params))))

(defn watch-namespaced-persistent-volume-claim-with-http-info
  "watch changes to an object of kind PersistentVolumeClaim"
  ([namespace name ] (watch-namespaced-persistent-volume-claim-with-http-info namespace name nil))
  ([namespace name {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/persistentvolumeclaims/{name}" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-namespaced-persistent-volume-claim
  "watch changes to an object of kind PersistentVolumeClaim"
  ([namespace name ] (watch-namespaced-persistent-volume-claim namespace name nil))
  ([namespace name optional-params]
   (:data (watch-namespaced-persistent-volume-claim-with-http-info namespace name optional-params))))

(defn watch-namespaced-persistent-volume-claim-list-with-http-info
  "watch individual changes to a list of PersistentVolumeClaim"
  ([namespace ] (watch-namespaced-persistent-volume-claim-list-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/persistentvolumeclaims" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-namespaced-persistent-volume-claim-list
  "watch individual changes to a list of PersistentVolumeClaim"
  ([namespace ] (watch-namespaced-persistent-volume-claim-list namespace nil))
  ([namespace optional-params]
   (:data (watch-namespaced-persistent-volume-claim-list-with-http-info namespace optional-params))))

(defn watch-namespaced-pod-with-http-info
  "watch changes to an object of kind Pod"
  ([namespace name ] (watch-namespaced-pod-with-http-info namespace name nil))
  ([namespace name {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/pods/{name}" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-namespaced-pod
  "watch changes to an object of kind Pod"
  ([namespace name ] (watch-namespaced-pod namespace name nil))
  ([namespace name optional-params]
   (:data (watch-namespaced-pod-with-http-info namespace name optional-params))))

(defn watch-namespaced-pod-list-with-http-info
  "watch individual changes to a list of Pod"
  ([namespace ] (watch-namespaced-pod-list-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/pods" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-namespaced-pod-list
  "watch individual changes to a list of Pod"
  ([namespace ] (watch-namespaced-pod-list namespace nil))
  ([namespace optional-params]
   (:data (watch-namespaced-pod-list-with-http-info namespace optional-params))))

(defn watch-namespaced-pod-template-with-http-info
  "watch changes to an object of kind PodTemplate"
  ([namespace name ] (watch-namespaced-pod-template-with-http-info namespace name nil))
  ([namespace name {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/podtemplates/{name}" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-namespaced-pod-template
  "watch changes to an object of kind PodTemplate"
  ([namespace name ] (watch-namespaced-pod-template namespace name nil))
  ([namespace name optional-params]
   (:data (watch-namespaced-pod-template-with-http-info namespace name optional-params))))

(defn watch-namespaced-pod-template-list-with-http-info
  "watch individual changes to a list of PodTemplate"
  ([namespace ] (watch-namespaced-pod-template-list-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/podtemplates" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-namespaced-pod-template-list
  "watch individual changes to a list of PodTemplate"
  ([namespace ] (watch-namespaced-pod-template-list namespace nil))
  ([namespace optional-params]
   (:data (watch-namespaced-pod-template-list-with-http-info namespace optional-params))))

(defn watch-namespaced-replication-controller-with-http-info
  "watch changes to an object of kind ReplicationController"
  ([namespace name ] (watch-namespaced-replication-controller-with-http-info namespace name nil))
  ([namespace name {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/replicationcontrollers/{name}" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-namespaced-replication-controller
  "watch changes to an object of kind ReplicationController"
  ([namespace name ] (watch-namespaced-replication-controller namespace name nil))
  ([namespace name optional-params]
   (:data (watch-namespaced-replication-controller-with-http-info namespace name optional-params))))

(defn watch-namespaced-replication-controller-list-with-http-info
  "watch individual changes to a list of ReplicationController"
  ([namespace ] (watch-namespaced-replication-controller-list-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/replicationcontrollers" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-namespaced-replication-controller-list
  "watch individual changes to a list of ReplicationController"
  ([namespace ] (watch-namespaced-replication-controller-list namespace nil))
  ([namespace optional-params]
   (:data (watch-namespaced-replication-controller-list-with-http-info namespace optional-params))))

(defn watch-namespaced-resource-quota-with-http-info
  "watch changes to an object of kind ResourceQuota"
  ([namespace name ] (watch-namespaced-resource-quota-with-http-info namespace name nil))
  ([namespace name {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/resourcequotas/{name}" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-namespaced-resource-quota
  "watch changes to an object of kind ResourceQuota"
  ([namespace name ] (watch-namespaced-resource-quota namespace name nil))
  ([namespace name optional-params]
   (:data (watch-namespaced-resource-quota-with-http-info namespace name optional-params))))

(defn watch-namespaced-resource-quota-list-with-http-info
  "watch individual changes to a list of ResourceQuota"
  ([namespace ] (watch-namespaced-resource-quota-list-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/resourcequotas" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-namespaced-resource-quota-list
  "watch individual changes to a list of ResourceQuota"
  ([namespace ] (watch-namespaced-resource-quota-list namespace nil))
  ([namespace optional-params]
   (:data (watch-namespaced-resource-quota-list-with-http-info namespace optional-params))))

(defn watch-namespaced-secret-with-http-info
  "watch changes to an object of kind Secret"
  ([namespace name ] (watch-namespaced-secret-with-http-info namespace name nil))
  ([namespace name {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/secrets/{name}" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-namespaced-secret
  "watch changes to an object of kind Secret"
  ([namespace name ] (watch-namespaced-secret namespace name nil))
  ([namespace name optional-params]
   (:data (watch-namespaced-secret-with-http-info namespace name optional-params))))

(defn watch-namespaced-secret-list-with-http-info
  "watch individual changes to a list of Secret"
  ([namespace ] (watch-namespaced-secret-list-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/secrets" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-namespaced-secret-list
  "watch individual changes to a list of Secret"
  ([namespace ] (watch-namespaced-secret-list namespace nil))
  ([namespace optional-params]
   (:data (watch-namespaced-secret-list-with-http-info namespace optional-params))))

(defn watch-namespaced-service-with-http-info
  "watch changes to an object of kind Service"
  ([namespace name ] (watch-namespaced-service-with-http-info namespace name nil))
  ([namespace name {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/services/{name}" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-namespaced-service
  "watch changes to an object of kind Service"
  ([namespace name ] (watch-namespaced-service namespace name nil))
  ([namespace name optional-params]
   (:data (watch-namespaced-service-with-http-info namespace name optional-params))))

(defn watch-namespaced-service-account-with-http-info
  "watch changes to an object of kind ServiceAccount"
  ([namespace name ] (watch-namespaced-service-account-with-http-info namespace name nil))
  ([namespace name {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/serviceaccounts/{name}" :get
             {:path-params   {"namespace" namespace "name" name }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-namespaced-service-account
  "watch changes to an object of kind ServiceAccount"
  ([namespace name ] (watch-namespaced-service-account namespace name nil))
  ([namespace name optional-params]
   (:data (watch-namespaced-service-account-with-http-info namespace name optional-params))))

(defn watch-namespaced-service-account-list-with-http-info
  "watch individual changes to a list of ServiceAccount"
  ([namespace ] (watch-namespaced-service-account-list-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/serviceaccounts" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-namespaced-service-account-list
  "watch individual changes to a list of ServiceAccount"
  ([namespace ] (watch-namespaced-service-account-list namespace nil))
  ([namespace optional-params]
   (:data (watch-namespaced-service-account-list-with-http-info namespace optional-params))))

(defn watch-namespaced-service-list-with-http-info
  "watch individual changes to a list of Service"
  ([namespace ] (watch-namespaced-service-list-with-http-info namespace nil))
  ([namespace {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/services" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-namespaced-service-list
  "watch individual changes to a list of Service"
  ([namespace ] (watch-namespaced-service-list namespace nil))
  ([namespace optional-params]
   (:data (watch-namespaced-service-list-with-http-info namespace optional-params))))

(defn watch-node-with-http-info
  "watch changes to an object of kind Node"
  ([name ] (watch-node-with-http-info name nil))
  ([name {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/nodes/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-node
  "watch changes to an object of kind Node"
  ([name ] (watch-node name nil))
  ([name optional-params]
   (:data (watch-node-with-http-info name optional-params))))

(defn watch-node-list-with-http-info
  "watch individual changes to a list of Node"
  ([] (watch-node-list-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/nodes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-node-list
  "watch individual changes to a list of Node"
  ([] (watch-node-list nil))
  ([optional-params]
   (:data (watch-node-list-with-http-info optional-params))))

(defn watch-persistent-volume-with-http-info
  "watch changes to an object of kind PersistentVolume"
  ([name ] (watch-persistent-volume-with-http-info name nil))
  ([name {:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/persistentvolumes/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-persistent-volume
  "watch changes to an object of kind PersistentVolume"
  ([name ] (watch-persistent-volume name nil))
  ([name optional-params]
   (:data (watch-persistent-volume-with-http-info name optional-params))))

(defn watch-persistent-volume-claim-list-for-all-namespaces-with-http-info
  "watch individual changes to a list of PersistentVolumeClaim"
  ([] (watch-persistent-volume-claim-list-for-all-namespaces-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/persistentvolumeclaims" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-persistent-volume-claim-list-for-all-namespaces
  "watch individual changes to a list of PersistentVolumeClaim"
  ([] (watch-persistent-volume-claim-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-persistent-volume-claim-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-persistent-volume-list-with-http-info
  "watch individual changes to a list of PersistentVolume"
  ([] (watch-persistent-volume-list-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/persistentvolumes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-persistent-volume-list
  "watch individual changes to a list of PersistentVolume"
  ([] (watch-persistent-volume-list nil))
  ([optional-params]
   (:data (watch-persistent-volume-list-with-http-info optional-params))))

(defn watch-pod-list-for-all-namespaces-with-http-info
  "watch individual changes to a list of Pod"
  ([] (watch-pod-list-for-all-namespaces-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/pods" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-pod-list-for-all-namespaces
  "watch individual changes to a list of Pod"
  ([] (watch-pod-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-pod-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-pod-template-list-for-all-namespaces-with-http-info
  "watch individual changes to a list of PodTemplate"
  ([] (watch-pod-template-list-for-all-namespaces-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/podtemplates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-pod-template-list-for-all-namespaces
  "watch individual changes to a list of PodTemplate"
  ([] (watch-pod-template-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-pod-template-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-replication-controller-list-for-all-namespaces-with-http-info
  "watch individual changes to a list of ReplicationController"
  ([] (watch-replication-controller-list-for-all-namespaces-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/replicationcontrollers" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-replication-controller-list-for-all-namespaces
  "watch individual changes to a list of ReplicationController"
  ([] (watch-replication-controller-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-replication-controller-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-resource-quota-list-for-all-namespaces-with-http-info
  "watch individual changes to a list of ResourceQuota"
  ([] (watch-resource-quota-list-for-all-namespaces-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/resourcequotas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-resource-quota-list-for-all-namespaces
  "watch individual changes to a list of ResourceQuota"
  ([] (watch-resource-quota-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-resource-quota-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-secret-list-for-all-namespaces-with-http-info
  "watch individual changes to a list of Secret"
  ([] (watch-secret-list-for-all-namespaces-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/secrets" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-secret-list-for-all-namespaces
  "watch individual changes to a list of Secret"
  ([] (watch-secret-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-secret-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-service-account-list-for-all-namespaces-with-http-info
  "watch individual changes to a list of ServiceAccount"
  ([] (watch-service-account-list-for-all-namespaces-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/serviceaccounts" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-service-account-list-for-all-namespaces
  "watch individual changes to a list of ServiceAccount"
  ([] (watch-service-account-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-service-account-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-service-list-for-all-namespaces-with-http-info
  "watch individual changes to a list of Service"
  ([] (watch-service-list-for-all-namespaces-with-http-info nil))
  ([{:keys [pretty label-selector field-selector watch resource-version timeout-seconds ]}]
   (call-api "/api/v1/watch/services" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "labelSelector" label-selector "fieldSelector" field-selector "watch" watch "resourceVersion" resource-version "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    []})))

(defn watch-service-list-for-all-namespaces
  "watch individual changes to a list of Service"
  ([] (watch-service-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-service-list-for-all-namespaces-with-http-info optional-params))))

