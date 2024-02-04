
# Cypher 
Cypher, an Android application built using Kotlin and Jetpack Compose that uses Gemini API from Google, to generate results based on the provided prompts.


## Objective:
**`Google Gemini`** is a cutting-edge family of multimodal large language models (LLMs) developed by Google DeepMind. Launched in December 2023, it marks a significant leap in AI capabilities, vying with OpenAI's GPT-4 for the title of the most powerful language model.

Gemini comes in three sizes, catering to different needs:

* **`Gemini Ultra:`** The most powerful version, handling highly complex tasks like scientific research or advanced AI development.
* **`Gemini Pro:`** A well-rounded model for scaling across diverse tasks, ideal for general applications like information retrieval or creative content generation.
* **`Gemini Nano:`** The most efficient and compact version, suitable for on-device use in smartphones or other resource-constrained environments.

Gemini represents a significant stride towards more versatile and impactful AI. Its multimodal capabilities pave the way for richer, more intuitive human-computer interactions and open doors to countless potential applications in various fields like education, healthcare, and artistic expression.

![gemini1](https://github.com/mrinmoyxb/Cypher/assets/141025752/bfa3dca3-1281-401a-8d4e-e3886e7d43e0)

The Vertex AI Gemini API supports the following use cases by model:

* **`Gemini Pro:`** Designed to handle natural language tasks, multiturn text and code chat, and code generation.
* **`Gemini Pro Vision:`** Supports multimodal prompts. You can include text, images, and video in your prompt requests and get text or code responses.

**Hence, the main objective of this project is to built an Android application, through which we can easily access and utilize the capabilities provided by the Gemini through it's API.**


## UI/UX

**`Onboarding Screens:`**

![cypher_onboarding](https://github.com/mrinmoyxb/Cypher/assets/141025752/14f8b2cd-6e49-4924-a840-b614122efce6)

**`Home Screen:`**
## About Application:

**`Gemini Pro`**

Gemini Pro, the middle child of the Google Gemini family, holds a sweet spot for scaling across a variety of tasks.
Gemini Pro, like other LLMs, thrives on prompts, which are essentially instructions or starting points that guide its output. These prompts can take various forms depending on the desired task and can incorporate different types of data, including text and images.
Balanced between raw power and efficiency, Gemini Pro runs well on both powerful AI platforms and less resource-intensive environments.

* Suitable for a wide range of applications, from large-scale data analysis to on-the-go mobile assistants.

* Cost-effective for developers and enterprises looking for a versatile AI solution.



**`Android`**

Android is a mobile operating system (OS) primarily designed for touchscreen mobile devices such as smartphones and tablets. It's based on a modified version of the Linux kernel and open-source software, with the most widely used version developed by Google.

**`API level requirements`**
* **minSdk** — The minimum version of the Android platform on which the app will run, specified by the platform's API level identifier. The minSdk required by the application is **minSdk 24**.
* **targetSdk** — The API level on which the app is designed to run. The targetSdk required by the application is **targetSdk 34**

## Key Concepts:

**`Design Pattern`**

MVVM stands for Model-View-ViewModel, a software design pattern that helps separate the development of the graphical user interface (GUI) from the development of the business logic or back-end logic (the model). This separation of concerns can make it easier to develop and maintain complex applications.

* **Model**: The model represents the data. It is responsible for storing data, processing data, and providing data to the view. 

* **View**: The view represents the user interface of an application. It is responsible for displaying data to the user and responding to user input.

* **View Model**: The view model is a bridge between the model and the view. It is responsible for translating data from the model into a format that the view can understand. 

**`API`**

An API, which stands for **Application Programming Interface**, is a set of rules and tools that allows two or more computer programs or components to communicate with each other. It acts as a middleman, facilitating the exchange of data and functionality between different systems.

## Language and library:

**`Language: Kotlin`**

Kotlin is a modern, concise programming language that offers offers type safety, extension functions, nullable types, and other features that make code cleaner, more expressive, and less prone to errors compared to Java.

**`Toolkit for UI: Jetpack Compose`**

Jetpack Compose is a declarative UI toolkit, which means instead of writing complex XML layouts, we define our UI in Kotlin code. This declarative approach makes designing UIs more intuitive and visually appealing.

**`Gemini Pro API`**

The Gemini Pro API is the interface that allows us to interact with the Gemini Pro model and leverage its capabilities in our own applications. It's essentially a set of commands we can send to the model, along with your data and instructions, to receive our desired outputs.
