import { TestBed } from '@angular/core/testing';

import { AuthedUserService } from './authed-user.service';

describe('AuthedUserService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AuthedUserService = TestBed.get(AuthedUserService);
    expect(service).toBeTruthy();
  });
});
