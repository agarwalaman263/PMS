// This file can be replaced during build by using the `fileReplacements` array.
// `ng build --prod` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.

export const environment = {
  production: false,
  start: 'http://localhost:8080/start',
  'Code Complexity': {
    link: 'http://localhost:8080/complexity'
  },
  'Code Coverage': {
    link: 'http://localhost:8080/coverage'
  },
  'Code Duplication': {
    link: 'http://localhost:8080/duplicate'
  },
  Security: {
    link: 'http://localhost:8080/security'
  },
  'Test Coverage': {
    link: 'http://localhost:8080/test'
  },
  'Compiler Warnings': {
    link: 'http://localhost:8080/warnings'
  }

};

/*
 * For easier debugging in development mode, you can import the following file
 * to ignore zone related error stack frames such as `zone.run`, `zoneDelegate.invokeTask`.
 *
 * This import should be commented out in production mode because it will have a negative impact
 * on performance if an error is thrown.
 */
// import 'zone.js/dist/zone-error';  // Included with Angular CLI.
