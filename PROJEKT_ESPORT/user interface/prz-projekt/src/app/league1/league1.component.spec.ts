import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { League1Component } from './league1.component';

describe('League1Component', () => {
  let component: League1Component;
  let fixture: ComponentFixture<League1Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ League1Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(League1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
