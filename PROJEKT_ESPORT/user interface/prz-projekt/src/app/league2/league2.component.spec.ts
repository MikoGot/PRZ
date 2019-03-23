import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { League2Component } from './league2.component';

describe('League2Component', () => {
  let component: League2Component;
  let fixture: ComponentFixture<League2Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ League2Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(League2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
