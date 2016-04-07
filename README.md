# OpenBaton
[![Build Status](https://travis-ci.org/openbaton/NFVO.svg?branch=master)](https://travis-ci.org/openbaton/NFVO)
[![Join the chat at https://gitter.im/openbaton/NFVO](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/openbaton/NFVO?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![Documentation Status](https://readthedocs.org/projects/openbaton-docs/badge/?version=latest)](http://openbaton-docs.readthedocs.org/en/latest/?badge=latest)

OpenBaton is an open source project providing a reference implementation of the NFVO and VNFM based on the ETSI [NFV MANO] specification. 

## Getting Started

`openbaton` is implemented in java using the [spring.io] framework. For more details about the NFVO architecture, you can refer to the following page.

## install the latest NFVO version from the source code

The NFVO uses the Java Messaging System for communicating with the [Generic VNFM](http://openbaton.github.io/documentation/vnfm-generic/). Therefore it is a prerequisites to have RabbitMQ up and running in case you want to use the [Generic VNFM](http://openbaton.github.io/documentation/vnfm-generic/). To facilitate the installation procedures we provide an installation script which can be used for installing the NFVO and the prerequired libraries.

```bash
bash <(curl -fsSkL http://get.openbaton.org/bootstrap)
```

At the end of the installation procedure, if there are no errors, the dashboard should be reachable at: http://localhost:8080. At this point the NFVO is ready to be used. Please refer to the [NFVO user guide](http://openbaton.github.io/documentation/) for how to start using it.

## Development

Want to contribute? Great! [Get in contact with us](mailto:users@openbaton.org).

## News and Website
Information about OpenBaton can be found on our @[website]. Follow us on Twitter @[openbaton].

## Supported by
Open Baton is a project developed by Fraunhofer FOKUS and TU Berlin. It is supported by different European publicly funded projects: 

* [NUBOMEDIA][nubomedia]
* [Mobile Cloud Networking][mcn]
* [CogNet][cognet]

[spring.io]:https://spring.io/
[NFV MANO]:http://www.etsi.org/deliver/etsi_gs/NFV-MAN/001_099/001/01.01.01_60/gs_nfv-man001v010101p.pdf
[openbaton]:http://twitter.com/openbaton
[website]:http://www.open-baton.org
[nubomedia]: https://www.nubomedia.eu/
[mcn]: http://mobile-cloud-networking.eu/site/
[cognet]: http://www.cognet.5g-ppp.eu/cognet-in-5gpp/

