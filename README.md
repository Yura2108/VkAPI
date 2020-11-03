# VK SDK Java

### RECHANGE PETERSAMOKHIN KOTLIN SDK
### OFFICIAL https://github.com/vksdk/vk-sdk-kotlin

<p align="center">Create a chat-bot for VK.com in a few lines of code, use the API and forget about the limitations</p>
<p align="center"><a href="https://vk.com/vk_sdk">https://vk.com/vk_sdk</a></p>

---

![Build](https://github.com/vksdk/vk-sdk-kotlin/workflows/Release/badge.svg) ![Documentation](https://github.com/vksdk/vk-sdk-kotlin/workflows/Documentation/badge.svg) [![Kotlin 1.4.10](https://img.shields.io/badge/Kotlin-1.4.10-blue.svg?style=flat)](http://kotlinlang.org) [![API version](https://img.shields.io/badge/API%20version-5.103+-blue?style=flat&logo=vk&logoColor=white)](https://vk.com/dev/versions)
[![GitHub license](https://img.shields.io/badge/License-MIT-yellow.svg?style=flat)](https://github.com/vksdk/vk-sdk-kotlin/blob/master/LICENSE)

Unofficial VK.com SDK

See the documentation: [https://vksdk.github.io/vk-sdk-kotlin](https://vksdk.github.io/vk-sdk-kotlin)

Latest version:  [![maven-central](https://img.shields.io/badge/Maven%20Central-0.0.7-yellowgreen?style=flat)](https://search.maven.org/search?q=g:com.petersamokhin.vksdk)

## Minimal example of the echo-chatbot

### Java
```java
int groupId = 151083290;
String accessToken = "abcdef123456...";

Group group = new Group(groupId, accessToken);

group.onSimpleTextMessage(callback -> callback...);

client.startLongPolling();
```

## Features
The primary goal of the library is to cover most of the possible needs but in an abstract way.
You can't find here a hundred of pre-defined data classes for each API method, but you can write the highly customizable solution in most convenient way.

- Supported platforms: JVM (+ Android), JS, darwin (iOS, macOS, tvOS, watchOS), mingwX64 (Windows), linuxX64
- Big and detailed examples: Multiplatform project (iOS & Android), Kotlin project, Java-only project. See the `examples` directory and the [documentation](https://vksdk.github.io/vk-sdk-kotlin/usage/).
- Written in Kotlin, but has JVM-friendly API with methods overloading, static methods, etc.
- Modularized and highly customizable: use pre-defined HTTP-clients or write your own; combine API calls, make queues or calls lists, etc.
- Use the client created from the `code` or from `access_token`.
- [Bots Long Poll API](https://vk.com/dev/bots_longpoll)
    - Event is a data class `MessageNew` for `message_new` event
    - and the [`JsonElement`](https://github.com/Kotlin/kotlinx.serialization) for all the other events
- Batch requests queue using [execute](https://vk.com/dev/execute) method under the hood: make up to 75+ requests per second and don't think about the [VK API limitations](https://vk.com/dev/api_requests?f=Limits%20and%20recommendations)
    - Putting into batch requests queue is optional, but done by default for asynchronous requests
    - Synchronous calls always sent immediately
- API calls:
    - Synchronous
    - Asynchronous (using callbacks)
    - Using [Kotlin Coroutines Flow](https://kotlinlang.org/docs/reference/coroutines/flow.html) wrapper
- [`messages.send`](https://vk.com/dev/messages.send): use DSL for sending messages and building keyboards. All method capabilities are covered.
    - Attach files in a couple of lines of code, using a file from disk, URL, etc.
  

## License
See the [License](https://github.com/vksdk/vk-sdk-kotlin/blob/master/LICENSE)
