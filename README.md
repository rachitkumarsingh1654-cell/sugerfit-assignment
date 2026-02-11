🚀 How to run locally

  1. Clone the repository
     -git clone https://github.com/rachitkumarsingh1654-cell/sugerfit-assignment.git

  2. Start the application
     -./gradlew bootRun

     

     
🔍 Available Endpoints

  1. Health Check = GET /health 
  Response:
  {
  "status": "ACTIVE",
  "service": "sugerfit-service",
  "timestamp": "..."
  }

  2. Data Processor = POST /example
  Request:
  {
  "userId": "123",
  "value": 42
  }

  Response:
  {
  "status": "SUCCESS",
  "requestId": "uuid"
  }



🏗 Design Decisions

   1. controller → handles HTTP requests 
      service → contains business logic
      dto → request/response models
      This keeps responsibilities separated and makes the code easier to maintain.

   2. DTO-based contracts 
      All API inputs and outputs are defined using DTOs to ensure:
      clear request/response structure
      easier validation

   3. Production-ready mindset 
      The structure is designed as a base template for:
      scalable microservices
      clear package separation



⚙️ Assumptions

  The HealthAPI will responsd with ACTIVE along with the service which we are running and the current time-stamp



🛣 Future Roadmap

  1. Database integration (PostgreSQL) 

  2. Logging with request tracing

  3. Validation framework

  4. Unit & integration tests
