import { TestBed } from '@angular/core/testing';

import { HttpServicesService } from './http-services.service';

describe('HttpServicesService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: HttpServicesService = TestBed.get(HttpServicesService);
    expect(service).toBeTruthy();
  });
});
