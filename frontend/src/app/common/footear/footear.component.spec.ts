/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { FootearComponent } from './footear.component';

describe('FootearComponent', () => {
  let component: FootearComponent;
  let fixture: ComponentFixture<FootearComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FootearComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FootearComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
